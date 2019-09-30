package bank.web;

import bank.entity.Customer;
import bank.repository.CustomerStore;
import bank.service.BankingService;
import bank.web.transferobjects.CustomerRequest;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import org.mockito.stubbing.Answer;
import org.springframework.http.ResponseEntity;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

public class CustomerServiceTest {

    @Mock
    BankingService bankingService;

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @InjectMocks CustomerService customerService;

    @Test
    public void testCreateNewCustomer() {
        when(bankingService.createCustomer(anyString())).thenAnswer(new Answer() {
            public Customer answer(InvocationOnMock invocation) {
                return new Customer(invocation.getArgument(0));
            }
        });
        CustomerRequest request = new CustomerRequest();
        request.setName("Aaron");
        ResponseEntity<Customer> customer = customerService.createCustomer(request);
        Assert.assertNotNull(customer);
        Assert.assertEquals("Aaron", customer.getBody().getName());
    }
}
