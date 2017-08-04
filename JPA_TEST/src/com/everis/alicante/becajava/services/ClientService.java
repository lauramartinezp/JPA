package com.everis.alicante.becajava.services;

import java.util.List;

import com.everis.alicante.becajava.domain.Client;

public interface ClientService {
	
	void createClient(Client client);
	List<Client>listClient();
	void updateClient(Client client);
	void findClient(Client client);
	

}
