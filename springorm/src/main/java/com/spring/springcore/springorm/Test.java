package com.spring.springcore.springorm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.springcore.springorm.product.DAO.ProductDAO;
import com.spring.springcore.springorm.product.entity.Product;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/spring/springcore/springorm/config.xml");
		ProductDAO obj = (ProductDAO) ctx.getBean("productDaoImpl");
		Product product = new Product();
		product.setId(1);
		product.setName("Iphone 17");
		product.setDesc("Expensive");
		product.setPrice(98000);

		System.out.println(obj.create(product));
	}

}
