package com.js.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class WatchMovie {
	
	public static void main(String[] args) {
		ClassPathResource resource = new ClassPathResource("myspring.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
	
		Movie m = new Movie();
		m.start();
	}

}
