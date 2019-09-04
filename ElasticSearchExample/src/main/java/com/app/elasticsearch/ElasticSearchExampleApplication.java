package com.app.elasticsearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.app.elasticsearch")
public class ElasticSearchExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElasticSearchExampleApplication.class, args);
	}
	

}
