package com.albuquerque.springlin.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.albuquerque.springlin.handlers.ResponseHandler;
import com.albuquerque.springlin.models.getclient.GetClientRequest;
import com.albuquerque.springlin.models.getclient.GetClientResponse;
import com.albuquerque.springlin.services.SandBoxService;

@RestController
@RequestMapping("/client")
public class ClientController {
	
	@Autowired
	SandBoxService sandboxService;
	
	@PostMapping
	public ResponseHandler getClient(@RequestBody GetClientRequest transaction) {
		try {
			GetClientResponse response = this.sandboxService.getClient(transaction);
			return new ResponseHandler(200, "Client Found !", response);
		} catch(Exception ex) {
			ex.printStackTrace(System.out);
			return new ResponseHandler(500, "Internal Server Error", ex.getMessage());
		}
	}

}
