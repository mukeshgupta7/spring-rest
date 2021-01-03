package com.psl.springtrg.springrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.psl.springtrg.springrest.model.Customer;
// config file we had added @EnableJpaRepository - Spring boot will do this for you
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
