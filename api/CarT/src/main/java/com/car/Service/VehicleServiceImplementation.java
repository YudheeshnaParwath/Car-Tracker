package com.car.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.car.Entity.Vehicle;
import com.car.Repository.IVehicleRepository;

@Service
public class VehicleServiceImplementation implements IVehicleService{
	
	@Autowired
	public IVehicleRepository vr;

	@Override
	public Vehicle createVehicle(Vehicle v) {
		// TODO Auto-generated method stub
		return vr.createVehicle(v) ;
	}

	
	public ArrayList<Vehicle> findAll()
	{
		return vr.findAll();
	}
}
