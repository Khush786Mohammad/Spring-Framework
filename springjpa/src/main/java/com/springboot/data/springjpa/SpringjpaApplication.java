package com.springboot.data.springjpa;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.springboot.data.springjpa.entity.Product;
import com.springboot.data.springjpa.repository.ProductRepository;

@SpringBootApplication
public class SpringjpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringjpaApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(ProductRepository repository) {
		return args -> {
			Product product = new Product();
			product.setName("Macbook");
			product.setDescription("awesome");
			product.setPrice(89000d);

			Product product2 = new Product();
			product2.setName("Iphone 17 Air");
			product2.setDescription("Stylish");
			product2.setPrice(97500D);

//			repository.save(product2);
			System.out.println("Product Saved!");

			Optional<Product> resultObject = repository.findById(3L);

			if (resultObject != null && !resultObject.isEmpty()) {
				System.out.println(resultObject.get().toString());
			}
			product.setName("Macbook Neo");
			product.setId(2L);
//			repository.save(product);
			
			Iterable<Product> products = repository.findAll();
			products.forEach((prod)->{
				System.out.println(prod);
			});
			
			List<Product> sameProducts = repository.findByName("macbook");
			System.out.println(sameProducts);
		};
	}
}
