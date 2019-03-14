package bank.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import bank.entity.Customer;
import bank.service.BankingService;

@RestController
public class CustomerService {

	@Autowired
	private BankingService bankingService;

	public CustomerService() {}

	public void setBankingService(BankingService service) {
		this.bankingService = service;
	}

	@RequestMapping("/customers")
	@ResponseBody
	public Customer getCustomer(@RequestParam() String name) {
		Customer customer = bankingService.getCustomer(name);
		if (customer == null) {
			
		}
		return customer;
	}
}
