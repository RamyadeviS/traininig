package com.epassproject.epassform;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.epassproject.epassform.controller.EpassController;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class EpassformApplication {

	public static void main(String[] args) {
		SpringApplication.run(EpassformApplication.class, args);
		Logger logger=LoggerFactory.getLogger(EpassController.class);
		
		logger.info("Welcome Epass");
	}

}
