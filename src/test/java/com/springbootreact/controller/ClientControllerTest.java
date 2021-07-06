package com.springbootreact.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.springbootreact.domain.Client;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ClientControllerTest {

	@Autowired
    private ClientController clientController;
	
	@Test
	public void getCientsTest() {
		List<Client> clients = clientController.getClients();
		assertEquals(5, clients.size());
	}
}
