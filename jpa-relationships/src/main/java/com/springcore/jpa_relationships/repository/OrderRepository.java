package com.springcore.jpa_relationships.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springcore.jpa_relationships.OneToMany.entity.Orders;

public interface OrderRepository extends JpaRepository<Orders, Long> {

}
