package com.example.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Springdxcb2Application {

	public static void main(String[] args) {
		SpringApplication.run(Springdxcb2Application.class, args);
		ApplicationContext vehiclesFactory = new ClassPathXmlApplicationContext("settingsconfig.xml");
		Vehicle vehicle = (Vehicle) vehiclesFactory.getBean("car"); 
		//Car car = new Car();
		vehicle.drive();
		
		System.out.println("hello spring");





		
	}

}
