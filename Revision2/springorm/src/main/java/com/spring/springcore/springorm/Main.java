package com.spring.springcore.springorm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.springcore.springorm.dao.PassengerDao;
import com.spring.springcore.springorm.daoImpl.PassengerDaoImpl;
import com.spring.springcore.springorm.entity.Passenger;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/springcore/springorm/config.xml");
		Passenger p1 = new Passenger();
		p1.setId(106);
		p1.setFirstname("Maya");
		p1.setLastname("Jeena");
		
		PassengerDao passenger = (PassengerDao) context.getBean("passengerImpl");
		passenger.savePassenger(p1);
		
	}
}
