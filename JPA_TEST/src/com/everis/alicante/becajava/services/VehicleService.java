package com.everis.alicante.becajava.services;

import java.util.List;

import com.everis.alicante.becajava.domain.Booking;
import com.everis.alicante.becajava.domain.Vehicle;

public interface VehicleService {

	
	void createVehicle(Vehicle vehicle);
	List<Vehicle>listClient();
	void updateBooking(Vehicle vehicle);
	void findBooking(Vehicle vehicle);
	Vehicle readById(int id);
}
