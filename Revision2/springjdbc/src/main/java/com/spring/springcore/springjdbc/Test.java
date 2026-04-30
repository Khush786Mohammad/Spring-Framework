package com.spring.springcore.springjdbc;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.springcore.springjdbc.dao.PassengerDao;
import com.spring.springcore.springjdbc.entity.Passenger;

public class Test {

	public static void main(String[] args) throws Exception {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/springcore/springjdbc/config.xml");

		Passenger p1 = new Passenger();
		p1.setId(102);
		p1.setFirstname("John");
		p1.setLastname("Cena");

		PassengerDao pDao = (PassengerDao) context.getBean("passenger");
//		int result = pDao.savePassenger(p1);
//		System.out.println("Passenger Save with Details: " + result);
//		
//		System.out.println("Passenger Updated: " + pDao.updatePassenger(p1));
//		System.out.println("Passenger Deleted: " + pDao.deletePassenger(101));
		System.out.println("Fetching Passenger by Id: " + pDao.getPassengerById(102));
		System.out.println("Fetching All Passenger: " + pDao.fetchAllPassengers());
	}
}
