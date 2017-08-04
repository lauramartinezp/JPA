package com.everis.alicante.becajava.implementacion;

import javax.persistence.EntityManager;

import com.everis.alicante.becajava.DAO.VehicleDAO;
import com.everis.alicante.becajava.domain.Vehicle;

public class VehicleDAOJPAImpl implements VehicleDAO{
	
	EntityManager em;
	
	public VehicleDAOJPAImpl(EntityManager em) {
		super();
		this.em = em;
	}

	@Override
	public void create(Vehicle vehicle) {

		em.merge(vehicle);
		
	}

	@Override
	public Vehicle readById(int id) {
		return em.find(Vehicle.class, id);
	}

	@Override
	public void update(Vehicle vehicle) {

		em.persist(vehicle);
	}

	@Override
	public void delete(Vehicle vehicle) {

		em.remove(vehicle);
	}

}
