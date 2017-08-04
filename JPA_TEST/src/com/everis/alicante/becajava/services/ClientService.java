package com.everis.alicante.becajava.services;

import java.util.List;

import com.everis.alicante.becajava.domain.Client;
import com.everis.alicante.becajava.domain.Vehicle;

public interface ClientService {
	
	void createClient(Client client, Vehicle vehicle);
	List<Client>listClient();
	void updateClient(Client client);
	void findClient(Client client);
	

}
