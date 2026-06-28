package com.springcore.jpa_relationships;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.springcore.jpa_relationships.entity.Aadhar;
import com.springcore.jpa_relationships.entity.Person;
import com.springcore.jpa_relationships.service.PersonService;

@SpringBootApplication
public class JpaRelationshipsApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaRelationshipsApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner run(PersonService service) {
		return args->{
			Person person = new Person();
			person.setName("Naveen Reddy");
			person.setAge(41);
			person.setCity("Banglore");
			
			Aadhar aadhar = new Aadhar();
			aadhar.setAadharNumber("717925481600");
			aadhar.setIssueDate(LocalDate.of(2022, 3,23));
			
			person.setAadhar(aadhar);
			aadhar.setPerson(person);
			service.savePerson(person);
		};
	}
}
