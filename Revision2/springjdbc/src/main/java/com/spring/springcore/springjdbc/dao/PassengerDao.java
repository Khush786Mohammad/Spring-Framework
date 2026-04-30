package com.spring.springcore.springjdbc.dao;

import java.util.List;
import java.util.Optional;

import com.spring.springcore.springjdbc.entity.Passenger;

public interface PassengerDao {
	public int savePassenger(Passenger p1);

	public int updatePassenger(Passenger p1);

	public int deletePassenger(int p1);

	public Passenger getPassengerById(int id);

	public List<Passenger> fetchAllPassengers();
}
