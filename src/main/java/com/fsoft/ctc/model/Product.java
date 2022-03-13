package com.fsoft.ctc.model;

public class Product {
	private String name;
	private String color;
	private int quantity;

	public Product(String name, String color, int quantity) {
		super();
		this.name = name;
		this.color = color;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
