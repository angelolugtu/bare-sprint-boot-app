package com.example.barespringbootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BareSpringBootAppApplication extends SpringBootServletInitializer {
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(BareSpringBootAppApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(BareSpringBootAppApplication.class, args);
	}
	
	@RequestMapping(value="/")
	public String getHomepage() {
		return "Hello world!";
	}
	

}
