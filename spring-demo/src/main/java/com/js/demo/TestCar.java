package com.js.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class TestCar {
	
	public static void main(String[] args) {
		ClassPathResource pathResource = new ClassPathResource("myspring.xml");
		BeanFactory beanFactory = new XmlBeanFactory(pathResource);
		
		Car c = (Car)beanFactory.getBean("car");
		
		c.e.start();
		c.move();
	}

}
