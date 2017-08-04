package com.everis.alicante.becajava.DAO;

import com.everis.alicante.becajava.domain.Booking;

public interface BookingDAO {
	
void create(Booking booking);
	
	Booking readById(int id);
	
	void update(Booking booking);
	
	void delete(Booking booking);

}
