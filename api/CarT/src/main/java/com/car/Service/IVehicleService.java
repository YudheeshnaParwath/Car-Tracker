package com.car.Service;

import java.util.ArrayList;
import java.util.List;

import com.car.Entity.Vehicle;

public interface IVehicleService {
	
	public Vehicle createVehicle(Vehicle v);
	public ArrayList<Vehicle> findAll();

}
