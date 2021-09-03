package com.fullcreative.main;

import org.springframework.context.annotation.Configuration;
@Configuration
public class AppConfig {

	public Tyre getBrandName() {
		
		return new Tyre(); 
	}
}
