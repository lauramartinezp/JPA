package com.everis.alicante.becajava.sevices.implementacion;

import java.util.List;

import com.everis.alicante.becajava.DAO.ParkingplaceDAO;
import com.everis.alicante.becajava.domain.Parkingplace;
import com.everis.alicante.becajava.services.ParkingplaceService;

public class ParkingplaceServiceImpl implements ParkingplaceService {
	
	private ParkingplaceDAO parkingplaceDao;

	public ParkingplaceDAO getParkingplaceDao() {
		return parkingplaceDao;
	}

	public void setParkingplaceDao(ParkingplaceDAO parkingplaceDao) {
		this.parkingplaceDao = parkingplaceDao;
	}

	@Override
	public List<Parkingplace> listParkingplace() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateParkingplace(Parkingplace parkingplace) {
		// TODO Auto-generated method stub

	}

	@Override
	public void findParkingplace(Parkingplace parkingplace) {
		// TODO Auto-generated method stub

	}

}
