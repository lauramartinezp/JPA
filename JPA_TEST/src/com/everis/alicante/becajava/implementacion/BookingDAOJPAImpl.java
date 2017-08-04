package com.everis.alicante.becajava.implementacion;

import javax.persistence.EntityManager;

import com.everis.alicante.becajava.DAO.BookingDAO;
import com.everis.alicante.becajava.domain.Booking;
import com.everis.alicante.becajava.domain.Client;

public class BookingDAOJPAImpl implements BookingDAO{
	
	EntityManager em;
	
	public BookingDAOJPAImpl(EntityManager em) {
		super();
		this.em = em;
	}

	@Override
	public void create(Booking booking) {
		em.getTransaction().begin();
		em.merge(booking);
		em.getTransaction().commit();
	}

	@Override
	public Booking readById(int id) {
		
		return em.find(Booking.class, id);
	}

	@Override
	public void update(Booking booking) {
		em.getTransaction().begin();
		em.persist(booking);
		em.getTransaction().commit();
	}

	@Override
	public void delete(Booking booking) {
		em.getTransaction().begin();
		em.remove(booking);
		em.getTransaction().commit();
	}
	

}
