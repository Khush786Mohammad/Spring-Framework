package com.springcore.jpa_relationships.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springcore.jpa_relationships.entity.Person;
import com.springcore.jpa_relationships.repository.PersonRepository;

@Service
public class PersonService {
	@Autowired
	private PersonRepository repository;

	public Person savePerson(Person p) {
		return repository.save(p);
	}
}
