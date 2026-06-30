package com.springcore.jpa_relationships.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springcore.jpa_relationships.OneToMany.entity.Orders;
import com.springcore.jpa_relationships.OneToOne.entity.Person;
import com.springcore.jpa_relationships.repository.OrderRepository;
import com.springcore.jpa_relationships.repository.PersonRepository;

@Service
public class CustomService {
	@Autowired
	private PersonRepository personRepository;

	@Autowired()
	private OrderRepository orderRepository;

	@Transactional
	public Person savePerson(Person p) {
		return personRepository.save(p);
	}

	@Transactional
	public Orders saveOrderDetails(Orders order) {
		return orderRepository.save(order);
	}
}
