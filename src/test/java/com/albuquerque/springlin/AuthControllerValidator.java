package com.albuquerque.springlin;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.albuquerque.springlin.controllers.AuthController;
import com.albuquerque.springlin.models.auth.LoginResponse;
import com.albuquerque.springlin.models.auth.User;

@SpringBootTest
public class AuthControllerValidator {
	
	@Autowired
	AuthController authController;
	
	@Test
	void authControllerValidation() {
		assertThat(authController).isNotNull();
	}
	
	@Test
	void loginValidation() {
		assertThat(authController.login(new User("demo@financialhouse.io", "cjaiU8CV")).getCode()).isEqualTo(200);
	}
	
	@Test
	void authValidation() {
		LoginResponse response = (LoginResponse) authController.login(new User("demo@financialhouse.io", "cjaiU8CV")).getResponse();
		assertThat(response.getStatus()).isEqualTo("APPROVED");
		assertThat(response.getToken()).isNotNull();
	}

}
