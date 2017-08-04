package com.everis.alicante.becajava.sevices.implementacion;

import java.util.List;


import com.everis.alicante.becajava.DAO.ClientDAO;
import com.everis.alicante.becajava.DAO.VehicleDAO;
import com.everis.alicante.becajava.domain.Client;
import com.everis.alicante.becajava.domain.Vehicle;
import com.everis.alicante.becajava.services.ClientService;

public class ClientServiceImpl implements ClientService {

	private ClientDAO clientDao;
	private VehicleDAO vehicleDao;
	
	
	@Override
	public void createClient(Client client, Vehicle vehicle) {

	clientDao.create(client);
	vehicleDao.create(vehicle);
	}

	@Override
	public List<Client> listClient() {
		return clientDao.findAll();
	}

	@Override
	public void updateClient(Client client) {

		clientDao.update(client);
		
	}

	@Override
	public void findClient(Client client) {

		clientDao.findAll();
		
	}

	public ClientDAO getClientDao() {
		return clientDao;
	}

	public void setClientDao(ClientDAO clientDao) {
		this.clientDao = clientDao;
	}
//	public ClientServiceImpl(ClientDAO clientDao) {
//		super();
//		this.clientDao = clientDao;
//	}
	
	

}
