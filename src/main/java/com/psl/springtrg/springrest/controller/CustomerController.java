package com.psl.springtrg.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.psl.springtrg.springrest.model.Customer;
import com.psl.springtrg.springrest.service.CustomerService;

// /api/cms/customers/10

@RestController
@RequestMapping("/api/cms")
public class CustomerController {
	
	@Autowired
	CustomerService service;
	
	// read customer 
	@GetMapping("/customers")
	public List<Customer> getCustomers(){
		return service.getAllCustomers();
	}
	
	
	@GetMapping("/customers/{cid}")
	public Customer getCustomerById(@PathVariable("cid") long custId) {
		return service.getCustomerById(custId);
	}
	
	@PostMapping("/customers")
	public String insertCustomer(@RequestBody Customer customer) {
		service.addCustomer(customer);
		return "Customer added successfully";
	}
	
	@PutMapping("/customers")
	public String updateCustomer(@RequestBody Customer customer) {
		service.addCustomer(customer);
		return "Customer added successfully";
	}
	
	@DeleteMapping("/customers/{cid}")
	public String deleteCustomer(@PathVariable("cid") long custId) {
		service.deleteCustomer(custId);
		return "Customer deleted successfully";
	}
	
}
