package com.fullcreative.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Tyre {

	@Autowired
	@Qualifier("truck") // call a truck implemention of vehicle interface
	private Vehicle vehicle;

	public void vehicleDetails() {

		System.out.println("MRF tyre");
		vehicle.start();
		vehicle.stop();
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
}
