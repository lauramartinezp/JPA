package com.everis.alicante.becajava.sevices.implementacion;

import java.util.List;

import com.everis.alicante.becajava.DAO.VehicleDAO;
import com.everis.alicante.becajava.domain.Vehicle;
import com.everis.alicante.becajava.services.VehicleService;

public class VehicleServiceImpl implements VehicleService {
	
	private VehicleDAO vehicledao;

	public VehicleDAO getVehicledao() {
		return vehicledao;
	}

	public void setVehicledao(VehicleDAO vehicledao) {
		this.vehicledao = vehicledao;
	}

	@Override
	public void createVehicle(Vehicle vehicle) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Vehicle> listClient() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateBooking(Vehicle vehicle) {
		// TODO Auto-generated method stub

	}

	@Override
	public void findBooking(Vehicle vehicle) {
		// TODO Auto-generated method stub

	}

	@Override
	public Vehicle readById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
