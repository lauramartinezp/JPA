package com.everis.alicante.becajava.implementacion;

import javax.persistence.EntityManager;

import com.everis.alicante.becajava.DAO.ClientDAO;
import com.everis.alicante.becajava.domain.Client;

public class ClientDAOJPAImpl implements ClientDAO {
	
	EntityManager em;
	
	public ClientDAOJPAImpl(EntityManager em) {
		super();
		this.em = em;
	}

	@Override
	public void create(Client client) {

		em.getTransaction().begin();
		  em.persist(client);
		  em.getTransaction().commit();
	}

	@Override
	public Client readById(int id) {
		
		return em.find(Client.class, id);
		
	}

	@Override
	public void update(Client client) {

		em.persist(client);
		
	}

	@Override
	public void delete(Client client) {

		em.remove(client);
		
	}
	
	

}
