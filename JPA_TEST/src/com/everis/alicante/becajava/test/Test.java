package com.everis.alicante.becajava.test;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import com.everis.alicante.becajava.DAO.ClientDAO;
import com.everis.alicante.becajava.domain.Client;
import com.everis.alicante.becajava.implementacion.ClientDAOJPAImpl;
import com.everis.alicante.becajava.sevices.implementacion.ClientServiceImpl;

public class Test {
	
	public static void main(String[] args) {
		
		EntityManager em = createEntityManager();
		
		ClientServiceImpl servicio = new ClientServiceImpl();
		
		ClientDAO dao = new ClientDAOJPAImpl(em);
		
		servicio.setClientDao(dao);
		
		
		
		//System.out.println("Cliente: " + dao.readById(1));
		
		//Crear un cliente
		Client client = new Client();
		
		client.setName("Pepito");
		client.setSurname("Palotes");
		client.setNif("48717958W");
		client.setTelephone("699111201");
		
		//dao.create(client);
	//	System.out.println("Cliente: " + dao.readById(2));
		System.out.println(dao.findAll());
		
	}
	
	static EntityManager createEntityManager() {
		
		return Persistence.createEntityManagerFactory("JPA_TEST").createEntityManager();
		
	}

}
