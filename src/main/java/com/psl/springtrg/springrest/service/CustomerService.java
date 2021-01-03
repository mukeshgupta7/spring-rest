package com.psl.springtrg.springrest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.psl.springtrg.springrest.model.Customer;
import com.psl.springtrg.springrest.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository repo;
	
	public Customer getCustomerById(long cid) {
		return repo.findById(cid).orElse(new Customer(100, "Default Customer", "Pune"));
	}
	
	public List<Customer> getAllCustomers(){
		return repo.findAll();
	}
	public void addCustomer(Customer customer) {
		repo.save(customer);
	}
	public void updateCustomer(Customer customer) {
		repo.save(customer);
	}
	public void deleteCustomer(long cid) {
		repo.deleteById(cid);
	}
}
