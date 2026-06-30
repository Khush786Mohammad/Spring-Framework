package com.springcore.jpa_relationships;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.springcore.jpa_relationships.OneToMany.entity.OrderItems;
import com.springcore.jpa_relationships.OneToMany.entity.Orders;
import com.springcore.jpa_relationships.OneToOne.entity.Aadhar;
import com.springcore.jpa_relationships.OneToOne.entity.Person;
import com.springcore.jpa_relationships.service.CustomService;

@SpringBootApplication
public class JpaRelationshipsApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaRelationshipsApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(CustomService service) {
		return args -> {
			Person person = new Person();
			person.setName("Talwiinder");
			person.setAge(29);
			person.setCity("Lahore");

			Aadhar aadhar = new Aadhar();
			aadhar.setAadharNumber("800025481600");
			aadhar.setIssueDate(LocalDate.of(2022, 3, 23));

			person.setAadhar(aadhar);
			aadhar.setPerson(person);
//			service.savePerson(person);

			Orders orders1 = new Orders();
			orders1.setCustomerName("Khush Mohammad");

			OrderItems orderItems1 = new OrderItems();
			orderItems1.setProduct_name("Shaving Foam");
			orderItems1.setQuantity(1);

			OrderItems orderItems2 = new OrderItems();
			orderItems2.setProduct_name("After Shave");
			orderItems2.setQuantity(1);

			OrderItems orderItems3 = new OrderItems();
			orderItems3.setProduct_name("Books");
			orderItems3.setQuantity(3);
			
			orderItems1.setOrders(orders1);
			orderItems2.setOrders(orders1);
			orderItems3.setOrders(orders1);
			
			List<OrderItems> orderList = new ArrayList<OrderItems>();
			orderList.add(orderItems1);
			orderList.add(orderItems2);
			orderList.add(orderItems3);
			
			orders1.setOrderItems(orderList);
			
			service.saveOrderDetails(orders1);

		};
	}
}
