package com.fullcreative.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

	public static void main(String[] args){

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Tyre tyre = context.getBean(Tyre.class);
		tyre.vehicleDetails();
	}

}
