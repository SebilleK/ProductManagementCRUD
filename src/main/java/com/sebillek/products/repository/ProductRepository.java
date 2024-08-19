package com.sebillek.products.repository;

import com.sebillek.products.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {

Product findByName (String name);


}
