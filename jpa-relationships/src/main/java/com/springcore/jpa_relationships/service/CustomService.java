package com.springcore.jpa_relationships.service;

import java.util.Optional;

import org.hibernate.LazyInitializationException;
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
	
	public Person fetchPerson(Long id) {
		Optional<Person> personData = personRepository.findById(id);
		if(personData != null && !personData.isEmpty())
			return personData.get();
		return null;
	}

	@Transactional
	public Person savePerson(Person p) {
		return personRepository.save(p);
	}

	@Transactional
	public Orders saveOrderDetails(Orders order) {
		return orderRepository.save(order);
	}
	
	@Transactional
	public Orders findOrders(Long id) throws LazyInitializationException{
		Orders orders = orderRepository.findById(id).orElse(null);
		orders.getOrderItems().size();
		return orders;
	}
}
