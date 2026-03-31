package com.spring.springcore.springorm.product.DAOImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.spring.springcore.springorm.product.DAO.ProductDAO;
import com.spring.springcore.springorm.product.entity.Product;

@Component("productDaoImpl")
public class ProductDaoImpl implements ProductDAO {

	@Autowired
	HibernateTemplate hibernateTemplate;

	@Override
	@Transactional
	public int create(Product product) {
		Integer result = (Integer) hibernateTemplate.save(product);
		return result;
	}

	@Override
	@Transactional
	public void update(Product product) {
		hibernateTemplate.update(product);
	}

	@Override
	@Transactional
	public void delete(Product product) {
		hibernateTemplate.delete(product);
	}

	@Override
	public Product fetchProductById(Integer id) {
		return hibernateTemplate.get(Product.class,id);
	}

	@Override
	public List<Product> fetchProducts() {
		return hibernateTemplate.loadAll(Product.class);
	}
}
