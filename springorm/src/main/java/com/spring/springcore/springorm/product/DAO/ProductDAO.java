package com.spring.springcore.springorm.product.DAO;

import java.util.List;

import com.spring.springcore.springorm.product.entity.Product;

public interface ProductDAO {
	int create(Product product);

	void update(Product product);

	void delete(Product product);

	Product fetchProductById(Integer id);

	List<Product> fetchProducts();
}
