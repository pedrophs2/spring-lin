package com.albuquerque.springlin.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;

import com.albuquerque.springlin.models.auth.LoginResponse;
import com.albuquerque.springlin.models.auth.User;
import com.albuquerque.springlin.models.getclient.GetClientRequest;
import com.albuquerque.springlin.models.getclient.GetClientResponse;
import com.albuquerque.springlin.models.gettransaction.GetTransactionRequest;
import com.albuquerque.springlin.models.gettransaction.GetTransactionResponse;
import com.albuquerque.springlin.models.listtransactions.TransactionFilters;
import com.albuquerque.springlin.models.listtransactions.TransactionListResponse;

public class SandBoxService {

	private static final String BASE_URL = "https://sandbox-reporting.rpdpymnt.com/api/v3";
	private static final User TEST_USER = new User("demo@financialhouse.io", "cjaiU8CV");
	private String token;

	@Autowired
	private RestTemplate restTemplate;

	public LoginResponse login(User user) {
		String uri = BASE_URL + "/merchant/user/login";
		LoginResponse response = restTemplate.postForObject(uri, user, LoginResponse.class);
		this.token = response.getToken();

		return response;
	}

	public TransactionListResponse getTransactionList(TransactionFilters filters, boolean auth) {
		String uri = BASE_URL + "/transaction/list";

		if (this.token == null && !auth)
			this.login(TEST_USER);

		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", this.token);
		
		HttpEntity<TransactionFilters> entity = new HttpEntity<>(filters, headers);

		TransactionListResponse response = restTemplate.postForObject(uri, entity, TransactionListResponse.class);

		return response;
	}

	public GetClientResponse getClient(GetClientRequest transaction, boolean auth) {
		String uri = BASE_URL + "/client";

		if (this.token == null && !auth)
			this.login(TEST_USER);

		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", this.token);
		
		HttpEntity<GetClientRequest> entity = new HttpEntity<>(transaction, headers);
		
		GetClientResponse response = restTemplate.postForObject(uri, entity, GetClientResponse.class);
		
		return response;
	}
	
	public GetTransactionResponse getTransaction(GetTransactionRequest transaction, boolean auth) {
		String uri = BASE_URL + "/transaction";

		if (this.token == null && !auth)
			this.login(TEST_USER);

		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", this.token);
		
		HttpEntity<GetTransactionRequest> entity = new HttpEntity<>(transaction, headers);
		
		GetTransactionResponse response = restTemplate.postForObject(uri, entity, GetTransactionResponse.class);
		
		return response;
	}

}
