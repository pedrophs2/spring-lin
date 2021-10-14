package com.albuquerque.springlin.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.albuquerque.springlin.handlers.ResponseHandler;
import com.albuquerque.springlin.models.gettransaction.GetTransactionRequest;
import com.albuquerque.springlin.models.gettransaction.GetTransactionResponse;
import com.albuquerque.springlin.models.listtransactions.TransactionFilters;
import com.albuquerque.springlin.models.listtransactions.TransactionQueryResponse;
import com.albuquerque.springlin.services.SandBoxService;

@RestController
@RequestMapping("/transaction")
public class TransactionController {
	
	@Autowired
	SandBoxService sandboxService;
	
	@PostMapping("/list")
	public ResponseHandler getTransactionList(@RequestBody TransactionFilters filters) {
		try {
			TransactionQueryResponse response = this.sandboxService.getTransactionList(filters);
			return new ResponseHandler(200, "Transactions Found !", response);
		} catch(Exception ex) {
			ex.printStackTrace(System.out);
			return new ResponseHandler(500, "Internal Server Error", ex.getMessage());
		}
	}
	
	@PostMapping
	public ResponseHandler getTransaction(@RequestBody GetTransactionRequest filters) {
		try {
			GetTransactionResponse response = this.sandboxService.getTransaction(filters);
			return new ResponseHandler(200, "Transaction Found !", response);
		} catch(Exception ex) {
			ex.printStackTrace(System.out);
			return new ResponseHandler(500, "Internal Server Error", ex.getMessage());
		}
	}

}
