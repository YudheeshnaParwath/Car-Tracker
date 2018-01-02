package com.car.Repository;

import java.util.ArrayList;
import java.util.List;

import com.car.Entity.Vehicle;

public interface IVehicleRepository {
	
	public Vehicle createVehicle(Vehicle v);
	public ArrayList<Vehicle> findAll();
	
}
