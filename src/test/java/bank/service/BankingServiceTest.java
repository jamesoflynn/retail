package bank.service;

import bank.entity.Customer;
import bank.repository.DBCustomerStore;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.mockito.AdditionalAnswers.returnsFirstArg;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class BankingServiceTest {

	@Mock
	DBCustomerStore DBCustomerStore;

	@Rule
	public MockitoRule mockitoRule = MockitoJUnit.rule();

	@InjectMocks BankingService service;

	@Test
	public void testNewCustomer() {
		when(DBCustomerStore.addNewCustomer(any(Customer.class))).thenAnswer(returnsFirstArg());
//		doAnswer(returnsFirstArg()).when(customerStore).addNewCustomer(any(Customer.class));
		Customer customer = service.createCustomer("Aaron");
		Assert.assertNotNull(customer);
		Assert.assertEquals("Aaron", customer.getName());
	}
}
