package com.everis.alicante.becajava.services;

import java.util.List;

import com.everis.alicante.becajava.domain.Booking;

public interface BookingService {
	
	void createBooking(Booking booking);
	List<Booking>listBooking();
	void updateBooking(Booking booking);
	void findBooking(Booking booking);
	Booking readById(int id);

}
