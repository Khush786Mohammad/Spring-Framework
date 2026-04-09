package com.springboot.data.springjpa.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.springboot.data.springjpa.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {
	public List<Product> findByName(String name);
}
