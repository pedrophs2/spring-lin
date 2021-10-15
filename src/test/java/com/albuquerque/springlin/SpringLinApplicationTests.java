package com.albuquerque.springlin;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.albuquerque.springlin.controllers.AuthController;
import com.albuquerque.springlin.controllers.ClientController;
import com.albuquerque.springlin.controllers.TransactionController;
import com.albuquerque.springlin.models.auth.LoginResponse;
import com.albuquerque.springlin.models.auth.User;
import com.albuquerque.springlin.models.getclient.GetClientRequest;
import com.albuquerque.springlin.models.getclient.GetClientResponse;
import com.albuquerque.springlin.models.gettransaction.GetTransactionRequest;
import com.albuquerque.springlin.models.gettransaction.GetTransactionResponse;
import com.albuquerque.springlin.models.listtransactions.TransactionFilters;
import com.albuquerque.springlin.models.listtransactions.TransactionListResponse;

@SpringBootTest
class SpringLinApplicationTests {

	@Autowired
	AuthController authController;
	
	@Autowired
	ClientController clientController;
	
	@Autowired
	TransactionController transactionController;
	
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
	
	@Test
	void clientControllerValidation() {
		assertThat(clientController).isNotNull();
	}
	
	@Test
	void getClientCodeValidation() {
		assertThat(clientController.getClient(new GetClientRequest("1030245-1606174013-1307")).getCode()).isEqualTo(200);
	}
	
	@Test
	void getClientResultValidation() {
		GetClientResponse response = (GetClientResponse) clientController.getClient(new GetClientRequest("1030245-1606174013-1307")).getResponse();
		assertThat(response.getCustomerInfo()).isNotNull();
		assertThat(response.getCustomerInfo().getId()).isNotNull();
	}
	
	@Test
	void transactionControllerValidation() {
		assertThat(transactionController).isNotNull();
	}
	
	@Test
	void getTransactionCodeValidation() {
		assertThat(transactionController.getTransaction(new GetTransactionRequest("1030245-1606174013-1307")).getCode()).isEqualTo(200);
	}
	
	@Test
	void getTransactionResultValidation() {
		GetTransactionResponse response = (GetTransactionResponse) transactionController.getTransaction(new GetTransactionRequest("1030245-1606174013-1307")).getResponse();
		assertThat(response.getCustomerInfo()).isNotNull();
		assertThat(response.getFx().getMerchant()).isNotNull();
		assertThat(response.getMerchant()).isNotNull();
		assertThat(response.getTransaction().getMerchant()).isNotNull();
	}
	
	@Test
	void listTransactionCodeValidation() {
		assertThat(transactionController.getTransactionList(new TransactionFilters("2015-07-01", "2021-10-01")).getCode()).isEqualTo(200);
	}
	
	@Test
	void listTransactionResultValidation() {
		TransactionListResponse response = (TransactionListResponse) transactionController.getTransactionList(new TransactionFilters("2015-07-01", "2021-10-01")).getResponse();
		assertThat(response.getData()).isNotNull();
	}


}
