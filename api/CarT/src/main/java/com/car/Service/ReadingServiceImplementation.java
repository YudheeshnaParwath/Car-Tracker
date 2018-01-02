package com.car.Service;

import org.springframework.stereotype.Service;

import com.car.Entity.Reading;
import com.car.Repository.IReadingRepository;

@Service
public class ReadingServiceImplementation implements IReadingService {

	
	public IReadingRepository ir;
	
	@Override
	public Reading createReading(Reading r) {
		// TODO Auto-generated method stub
		return ir.createReading(r);
	}
	
	

}
