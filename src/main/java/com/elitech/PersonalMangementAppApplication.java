package com.elitech;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.elitech.repository.UserRepository;

@SpringBootApplication
public class PersonalMangementAppApplication implements CommandLineRunner {

	 
	
	public static void main(String[] args) {
		SpringApplication.run(PersonalMangementAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
