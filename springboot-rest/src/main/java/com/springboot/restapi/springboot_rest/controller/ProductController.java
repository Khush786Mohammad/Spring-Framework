package com.springboot.restapi.springboot_rest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.restapi.springboot_rest.entity.Product;
import com.springboot.restapi.springboot_rest.repository.ProductRepository;

@RestController
@RequestMapping("/products")
public class ProductController {
	private final ProductRepository repository;

	@GetMapping("/get-product/{id}")
	public Product getProduct(@PathVariable("id") Long id) {
		Optional<Product> objOptional = repository.findById(id);
		Product product = null;
		if(!objOptional.isEmpty()) {
			product = objOptional.get();
		}
		return product;
	}
	@GetMapping("/get-products")
	public List<Product> getProducts() {
		List<Product> products = repository.findAll();
		return products;
	}

	@Autowired
	public ProductController(ProductRepository repository) {
		this.repository = repository;
	}
	
	@PostMapping(value = "/add-product", consumes = "application/json")
	public Product create(@RequestBody Product product) {
		return repository.save(product);
	}
	
	@PutMapping(value="/update-product", consumes="application/json")
	public Product updateProduct(@RequestBody Product product) {
		return repository.save(product);
	}
}
