package com.springbootreact;

import com.github.javafaker.Faker;
import com.springbootreact.domain.Client;
import com.springbootreact.repository.ClientRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class BootDataInitializer implements CommandLineRunner {

	private final ClientRepository clientRepository;
	private final Faker faker = new Faker(Locale.getDefault());

	public BootDataInitializer(ClientRepository clientRepository) {
		this.clientRepository = clientRepository;
	}

	@Override
	public void run(String... args) {
		for (int i = 0; i < 5; i++) {
			Client client = new Client();
			client.setName(faker.name().fullName());
			client.setEmail(faker.internet().emailAddress());

			clientRepository.save(client);
		}
	}
}
