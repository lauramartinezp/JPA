package com.everis.alicante.becajava.implementacion;

import javax.persistence.EntityManager;

import com.everis.alicante.becajava.DAO.ParkingplaceDAO;
import com.everis.alicante.becajava.domain.Parkingplace;

public class ParkingplaceDAOJPAImpl implements ParkingplaceDAO {
	
	EntityManager em;
	
	public ParkingplaceDAOJPAImpl(EntityManager em) {
		super();
		this.em = em;
	}

	@Override
	public void create(Parkingplace parkingplace) {
		em.getTransaction().begin();
		em.merge(parkingplace);
		em.getTransaction().commit();
	}

	@Override
	public Parkingplace readById(int id) {
		return em.find(Parkingplace.class, id);
	}

	@Override
	public void update(Parkingplace parkingplace) {
		em.getTransaction().begin();
		em.persist(parkingplace);
		em.getTransaction().commit();
	}

	@Override
	public void delete(Parkingplace parkingplace) {
		em.getTransaction().begin();
		em.remove(parkingplace);
		em.getTransaction().commit();
	}

}
