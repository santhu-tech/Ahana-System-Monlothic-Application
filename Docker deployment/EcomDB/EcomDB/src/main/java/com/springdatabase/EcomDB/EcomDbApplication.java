package com.springdatabase.EcomDB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.AbstractEnvironment;

@SpringBootApplication
public class EcomDbApplication {

	public static void main(String[] args) {
		//System.setProperty(AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME,"dev");
		SpringApplication.run(EcomDbApplication.class, args);
	}

}
