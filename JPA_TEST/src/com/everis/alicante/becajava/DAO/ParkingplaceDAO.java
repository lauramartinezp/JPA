package com.everis.alicante.becajava.DAO;

import com.everis.alicante.becajava.domain.Parkingplace;

public interface ParkingplaceDAO {
	
	void create(Parkingplace parkingplace);
	
	Parkingplace readById(int id);
	
	void update(Parkingplace parkingplace);
	
	void delete(Parkingplace parkingplace);

}
