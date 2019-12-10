package com.fse.capsule.taskmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // Tells SpringBoot that this is the starting point of
						// our Spring Boot Application
public class FseTakManagerApp {

	public static void main(String[] args) {
		SpringApplication.run(FseTakManagerApp.class, args);
		// This static method
		// Sets the default configurations
		// Starts the spring application context
		// Performs class path scan
		// Starts the embedded TOMCAT server

	}
	
	


}


