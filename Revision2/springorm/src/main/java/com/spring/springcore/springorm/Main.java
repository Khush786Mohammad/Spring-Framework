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
		p1.setId(110);
		p1.setFirstname("Honey");
		p1.setLastname("Fruit");
		
		PassengerDao passenger = (PassengerDao) context.getBean("passengerImpl");
//		passenger.savePassenger(p1);
		
		passenger.deletePassenger(110);	
	}
}
