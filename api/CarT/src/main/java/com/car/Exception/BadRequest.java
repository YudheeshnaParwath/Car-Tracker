package com.car.Exception;

public class BadRequest extends RuntimeException{

	public BadRequest(String message)
	{
		super(message);
	}
}