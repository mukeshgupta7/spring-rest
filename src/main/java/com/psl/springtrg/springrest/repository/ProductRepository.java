package com.psl.springtrg.springrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.psl.springtrg.springrest.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
