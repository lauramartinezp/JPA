package com.everis.alicante.becajava.implementacion;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

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

		em.getTransaction().begin();
		em.persist(client);
		em.getTransaction().commit();
		
	}

	@Override
	public void delete(Client client) {

		em.getTransaction().begin();
		em.remove(client);
		em.getTransaction().commit();
		
	}

	@Override
	public List<Client> findAll() {
		
		Query query=em.createNamedQuery("Client.findAll");
		
		return query.getResultList();
	}
	
	

}
