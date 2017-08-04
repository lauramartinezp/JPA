package com.everis.alicante.becajava.sevices.implementacion;

import java.util.List;


import com.everis.alicante.becajava.DAO.ClientDAO;
import com.everis.alicante.becajava.domain.Client;
import com.everis.alicante.becajava.services.ClientService;

public class ClientServiceImpl implements ClientService {

	private ClientDAO clientDao;
	
	
	@Override
	public void createClient(Client client) {

	}

	public ClientDAO getClientDao() {
		return clientDao;
	}

	public void setClientDao(ClientDAO clientDao) {
		this.clientDao = clientDao;
	}

	@Override
	public List<Client> listClient() {
		return clientDao.findAll();
	}

	@Override
	public void updateClient(Client client) {
		// TODO Auto-generated method stub

	}

	@Override
	public void findClient(Client client) {
		// TODO Auto-generated method stub

	}

//	public ClientServiceImpl(ClientDAO clientDao) {
//		super();
//		this.clientDao = clientDao;
//	}
	
	

}
