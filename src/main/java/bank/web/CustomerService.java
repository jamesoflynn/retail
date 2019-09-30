package bank.web;

import bank.web.transferobjects.CustomerRequest;
import bank.web.transferobjects.ErrorMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import bank.entity.Customer;
import bank.service.BankingService;

@RestController
@RequestMapping("customers")
public class CustomerService {

	@Autowired
	private BankingService bankingService;

	public CustomerService() {}

	public void setBankingService(BankingService service) {
		this.bankingService = service;
	}

	@GetMapping(path = "/{name}", produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public ResponseEntity<?> getCustomer(@PathVariable("name") String name) {
		Customer customer = bankingService.getCustomer(name);
		if (customer == null) {
			return new ResponseEntity<>(new ErrorMessage("No such customer"), HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(customer, HttpStatus.OK);
	}

	@PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public ResponseEntity<Customer> createCustomer(@RequestBody CustomerRequest customer) {
		Customer created = bankingService.createCustomer(customer.getName());
		return new ResponseEntity<Customer>(created, HttpStatus.CREATED);
	}
}
