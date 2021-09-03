package com.fullcreative.main;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{

	public void start() {
		System.out.println("starting car engine...");

	}

	public void stop() {
		System.out.println("stopping car engine...");

	}

	
}
