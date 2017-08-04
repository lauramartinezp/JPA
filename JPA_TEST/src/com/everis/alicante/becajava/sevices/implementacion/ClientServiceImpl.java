package com.everis.alicante.becajava.sevices.implementacion;

import java.util.List;

import com.everis.alicante.becajava.DAO.ClientDAO;
import com.everis.alicante.becajava.DAO.VehicleDAO;
import com.everis.alicante.becajava.domain.Client;
import com.everis.alicante.becajava.services.ClientService;

public class ClientServiceImpl implements ClientService {

	ClientDAO clientDao;
	
	VehicleDAO vehicleDao;
	
	@Override
	public void createClient(Client client) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Client> listClient() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateClient(Client client) {
		// TODO Auto-generated method stub

	}

	@Override
	public void findClient(Client client) {
		// TODO Auto-generated method stub

	}

}
