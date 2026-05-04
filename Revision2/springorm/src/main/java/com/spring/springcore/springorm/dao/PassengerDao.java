package com.spring.springcore.springorm.dao;

import java.util.List;

import com.spring.springcore.springorm.entity.Passenger;

public interface PassengerDao {
	public int savePassenger(Passenger p1);

	public void updatePassenger(Passenger p1);

	public void deletePassenger(int p1);

	public Passenger getPassengerById(int id);

	public List<Passenger> fetchAllPassengers();
}
