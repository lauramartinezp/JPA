package com.everis.alicante.becajava.sevices.implementacion;

import java.util.List;

import com.everis.alicante.becajava.DAO.BookingDAO;
import com.everis.alicante.becajava.domain.Booking;
import com.everis.alicante.becajava.services.BookingService;

public class BookingServiceImpl implements BookingService {
	
	private BookingDAO bookingDao;

	@Override
	public void createBooking(Booking booking) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Booking> listBooking() {
		// TODO Auto-generated method stub
		return null;
	}

	public BookingDAO getBookingDao() {
		return bookingDao;
	}

	public void setBookingDao(BookingDAO bookingDao) {
		this.bookingDao = bookingDao;
	}

	@Override
	public void updateBooking(Booking booking) {
		// TODO Auto-generated method stub

	}

	@Override
	public void findBooking(Booking booking) {
		// TODO Auto-generated method stub

	}

	@Override
	public Booking readById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
