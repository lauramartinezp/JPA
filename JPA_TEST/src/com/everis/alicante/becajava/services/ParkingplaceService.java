package com.everis.alicante.becajava.services;

import java.util.List;

import com.everis.alicante.becajava.domain.Parkingplace;

public interface ParkingplaceService {
	
	List<Parkingplace>listParkingplace();
	void updateParkingplace(Parkingplace parkingplace);
	void findParkingplace(Parkingplace parkingplace);

}
