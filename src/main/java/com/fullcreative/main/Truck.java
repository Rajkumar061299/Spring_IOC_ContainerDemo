package com.fullcreative.main;

import org.springframework.stereotype.Component;

@Component
public class Truck implements Vehicle{

	public void start() {
		System.out.println("starting truck engine...");

	}

	public void stop() {
		System.out.println("stopping truck engine...");

	}


}
