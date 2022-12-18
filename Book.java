package com.gl.utilities;

public class Book {
	private int id;
	private String name;
	private double price;
	private String genre;
	public Book() {
		super();
	}
	
	public Book(int id, String name, long price, String genre) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.genre = genre;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	

}
