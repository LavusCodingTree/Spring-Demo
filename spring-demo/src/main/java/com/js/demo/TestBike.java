package com.js.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class TestBike {

	public static void main(String[] args) {
		ClassPathResource resource = new ClassPathResource("myspring.xml");
		BeanFactory factory = new XmlBeanFactory(resource);

	    Bike b= (Bike)factory.getBean("bike");
	    
	    b.start();
	}
}
