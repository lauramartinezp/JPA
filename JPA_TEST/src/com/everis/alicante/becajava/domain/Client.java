package com.everis.alicante.becajava.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the client database table.
 * 
 */
@Entity
@NamedQuery(name="Client.findAll", query="SELECT c FROM Client c")
public class Client implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idCLIENT;

	private String name;

	private String nif;

	private String surname;

	private String telephone;

	//bi-directional many-to-one association to Booking
	@OneToMany(mappedBy="client")
	private List<Booking> bookings;

	//bi-directional many-to-one association to Vehicle
	@OneToMany(mappedBy="client")
	private List<Vehicle> vehicles;

	public Client() {
	}

	public int getIdCLIENT() {
		return this.idCLIENT;
	}

	public void setIdCLIENT(int idCLIENT) {
		this.idCLIENT = idCLIENT;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNif() {
		return this.nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getSurname() {
		return this.surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public List<Booking> getBookings() {
		return this.bookings;
	}

	public void setBookings(List<Booking> bookings) {
		this.bookings = bookings;
	}

	public Booking addBooking(Booking booking) {
		getBookings().add(booking);
		booking.setClient(this);

		return booking;
	}

	public Booking removeBooking(Booking booking) {
		getBookings().remove(booking);
		booking.setClient(null);

		return booking;
	}

	public List<Vehicle> getVehicles() {
		return this.vehicles;
	}

	public void setVehicles(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}

	public Vehicle addVehicle(Vehicle vehicle) {
		getVehicles().add(vehicle);
		vehicle.setClient(this);

		return vehicle;
	}

	public Vehicle removeVehicle(Vehicle vehicle) {
		getVehicles().remove(vehicle);
		vehicle.setClient(null);

		return vehicle;
	}

	@Override
	public String toString() {
		return "Client [idCLIENT=" + idCLIENT + ", name=" + name + ", nif=" + nif + ", surname=" + surname
				+ ", telephone=" + telephone + ", bookings=" + bookings + ", vehicles=" + vehicles + "]";
	}

	
	
}