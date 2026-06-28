package com.springcore.jpa_relationships.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springcore.jpa_relationships.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
