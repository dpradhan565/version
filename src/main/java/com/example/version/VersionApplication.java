package com.example.version;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VersionApplication {

	
	public static Logger logger = LoggerFactory.getLogger(VersionApplication.class);
	
	@PostConstruct
	public void intt() {
		logger.info("Application Stared!!!");
	}
	public static void main(String[] args) {
		logger.info("Application Executed!!!");
		logger.info("Application Executed!!!!!!!!!!");
		SpringApplication.run(VersionApplication.class, args);
	}

}
