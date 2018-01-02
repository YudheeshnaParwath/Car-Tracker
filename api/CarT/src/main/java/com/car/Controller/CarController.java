package com.car.Controller;

import com.car.Entity.Reading;
import com.car.Entity.Vehicle;
import com.car.Repository.IReadingRepository;
import com.car.Service.IVehicleService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class CarController {
	@Autowired
	public IVehicleService vs;
	
	@Autowired
	public IReadingRepository rs;
	
	
	@ResponseBody
	@RequestMapping(method= RequestMethod.GET, value="/all", produces= {MediaType.APPLICATION_JSON_VALUE})
	public ArrayList<Vehicle> findAll()
	{
		System.out.println("ABCD Controller");
		return vs.findAll();
	}


	@ResponseBody
	@RequestMapping(method= RequestMethod.POST, value="/add", produces= {MediaType.APPLICATION_JSON_VALUE})
	public Reading createReading(@RequestBody Reading r)
	{
		System.out.println("creating reading object");
		System.out.println(r);
		return rs.createReading(r);
		
	}
	

}
