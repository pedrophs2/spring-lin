package com.albuquerque.springlin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.albuquerque.springlin.services.SandBoxService;

@SpringBootApplication
public class SpringLinApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringLinApplication.class, args);
	}
	
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	@Bean
	public SandBoxService sandboxService() {
		return new SandBoxService();
	}

}
