package com.everis.alicante.becajava.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the parkingplace database table.
 * 
 */
@Entity
@NamedQuery(name="Parkingplace.findAll", query="SELECT p FROM Parkingplace p")
public class Parkingplace implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idParkingPlace;

	private int parkingNumber;

	private double parkingPrize;

	private double parkingSize;

	private byte parkingState;

	//bi-directional many-to-one association to Booking
	@OneToMany(mappedBy="parkingplace")
	private List<Booking> bookings;

	public Parkingplace() {
	}

	public int getIdParkingPlace() {
		return this.idParkingPlace;
	}

	public void setIdParkingPlace(int idParkingPlace) {
		this.idParkingPlace = idParkingPlace;
	}

	public int getParkingNumber() {
		return this.parkingNumber;
	}

	public void setParkingNumber(int parkingNumber) {
		this.parkingNumber = parkingNumber;
	}

	public double getParkingPrize() {
		return this.parkingPrize;
	}

	public void setParkingPrize(double parkingPrize) {
		this.parkingPrize = parkingPrize;
	}

	public double getParkingSize() {
		return this.parkingSize;
	}

	public void setParkingSize(double parkingSize) {
		this.parkingSize = parkingSize;
	}

	public byte getParkingState() {
		return this.parkingState;
	}

	public void setParkingState(byte parkingState) {
		this.parkingState = parkingState;
	}

	public List<Booking> getBookings() {
		return this.bookings;
	}

	public void setBookings(List<Booking> bookings) {
		this.bookings = bookings;
	}

	public Booking addBooking(Booking booking) {
		getBookings().add(booking);
		booking.setParkingplace(this);

		return booking;
	}

	public Booking removeBooking(Booking booking) {
		getBookings().remove(booking);
		booking.setParkingplace(null);

		return booking;
	}

	@Override
	public String toString() {
		return "Parkingplace [idParkingPlace=" + idParkingPlace + ", parkingNumber=" + parkingNumber + ", parkingPrize="
				+ parkingPrize + ", parkingSize=" + parkingSize + ", parkingState=" + parkingState + ", bookings="
				+ bookings + "]";
	}

	
	
}