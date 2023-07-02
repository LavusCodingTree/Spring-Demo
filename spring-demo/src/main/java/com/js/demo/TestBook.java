package com.js.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class TestBook {
	
	public static void main(String[] args) {
		ClassPathResource resource = new ClassPathResource("myspring.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		System.out.println("Injuction values using Constructor");
		Book b = (Book)factory.getBean("book");
		b.details();
		
		System.out.println("========================================");
		
		
		System.out.println("Injecting values using Setter Method");
		Book b1=(Book) factory.getBean("bo");
		b1.details();
		
		
	}

}
