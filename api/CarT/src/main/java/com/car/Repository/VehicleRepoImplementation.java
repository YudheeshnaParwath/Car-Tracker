package com.car.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.car.Entity.Vehicle;
@Repository
public class VehicleRepoImplementation implements IVehicleRepository{

	@Override
	public Vehicle createVehicle(Vehicle v) {
		v.setMake("CIVIC");
		System.out.println(v);
		return v;
	}

	@Override
	public ArrayList<Vehicle> findAll() {
		// TODO Auto-generated method stub
		System.out.println("Yudhi ");
		
		Vehicle v1=new Vehicle();
		v1.setMake("HONDA");
		Vehicle v2=new Vehicle();
		v2.setMaxFuelVolume(500);
		
		ArrayList<Vehicle> vl= new ArrayList<Vehicle>();
		
		vl.add(v1);
		vl.add(v2);
		
		
		return vl;
	}

}
