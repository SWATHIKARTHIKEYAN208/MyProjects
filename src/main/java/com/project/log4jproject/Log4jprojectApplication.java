package com.project.log4jproject;

import org.apache.log4j.BasicConfigurator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
@SpringBootApplication
public class Log4jprojectApplication {
	static Logger log=Logger.getLogger(Log4jprojectApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(Log4jprojectApplication.class, args);
		//BasicConfigurator.configure();
		PropertyConfigurator.configure("log4j.properties");
		log.info("Information");
		log.error("Error");
		log.debug("Debugging");
		log.fatal("Critical error");
		log.warn("Warning");
	}
	

}
