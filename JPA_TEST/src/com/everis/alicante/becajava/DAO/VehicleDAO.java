package com.everis.alicante.becajava.DAO;

import com.everis.alicante.becajava.domain.Vehicle;

public interface VehicleDAO {

void create(Vehicle vehicle);
	
	Vehicle readById(int id);
	
	void update(Vehicle vehicle);
	
	void delete(Vehicle vehicle);
	
}
