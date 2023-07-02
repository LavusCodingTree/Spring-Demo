package com.js.demo;

public class Book {

	int id;
	String name;
	int noOfPages;

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}

	public Book() {

	}

	public Book(int id, String name, int noOfPages) {
		this.id = id;
		this.name = name;
		this.noOfPages = noOfPages;
	}

	public void details() {
		System.out.println("Book Id = " + this.id);
		System.out.println("Book Name = " + this.name);
		System.out.println("No Of Pages = " + this.noOfPages);
	}

}
