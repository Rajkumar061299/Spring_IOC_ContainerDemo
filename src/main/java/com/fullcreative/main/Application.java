package com.fullcreative.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Application {

	public static void main(String[] args) {

		usingBeanFactory();
		usingApplicationContext();

	}

	private static void usingBeanFactory() {

		System.out.println("--------------Using Bean Factory----------------");
		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		System.out.println("---------------------------------");
		Vehicle vehicle = (Vehicle) factory.getBean("vehicle");
		vehicle.start();
		vehicle.stop();

	}

	private static void usingApplicationContext() {

		System.out.println("--------------Using Application Context----------------");
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("---------------------------------");
		Vehicle vehicle = (Vehicle) context.getBean("vehicle");
		vehicle.start();
		vehicle.stop();

	}

}
