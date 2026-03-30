package com.spring.springcore.springorm.product.DAOImpl;

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
}
