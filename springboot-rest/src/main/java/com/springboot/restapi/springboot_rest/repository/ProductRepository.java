package com.springboot.restapi.springboot_rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.restapi.springboot_rest.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
