package com.car.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.car.Entity.Reading;

@Repository
public class ReadingRepoImplementation implements IReadingRepository{
	
	@PersistenceContext
	private EntityManager man;

	
	
	//@Transactional(propagation = Propagation.REQUIRED)
	@Transactional(readOnly = true)
	public Reading createReading(Reading r) {
		System.out.println("Read Repo imp");
		
		man.getTransaction().begin();
		man.persist(r);
		man.getTransaction().commit();
		return r;
		
		
	
		
	}

	
}
