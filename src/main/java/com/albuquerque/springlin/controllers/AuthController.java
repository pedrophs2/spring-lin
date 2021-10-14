package com.albuquerque.springlin.controllers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.albuquerque.springlin.handlers.ResponseHandler;
import com.albuquerque.springlin.models.auth.LoginResponse;
import com.albuquerque.springlin.models.auth.User;
import com.albuquerque.springlin.services.SandBoxService;

@RestController
@RequestMapping("/auth")
public class AuthController {
	
	@Autowired
	RestTemplate connection;
	
	@Autowired
	SandBoxService sandboxService;

	@PostMapping("/login")
	public ResponseHandler login(@RequestBody User user) {
		try {
			LoginResponse response = this.sandboxService.login(user);
			
			return new ResponseHandler(200, "Authenticated", response);
		} catch (Exception ex) {
			ex.printStackTrace(System.out);
			return new ResponseHandler(500, "Internal Server Error", ex.getMessage());
		}
	}

}
