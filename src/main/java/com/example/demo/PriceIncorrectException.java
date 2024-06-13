package com.example.demo;

public class PriceIncorrectException extends RuntimeException {
	public PriceIncorrectException(String message) {
		super(message);
	}
}
