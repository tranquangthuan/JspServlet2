package com.fsoft.ctc.model;

public class Product {
	private int id;
	private String name;
	private String color;
	private int quantity;

	public Product(String name, String color, int quantity) {
		super();
		this.name = name;
		this.color = color;
		this.quantity = quantity;
	}

	public Product(int id, String name, String color, int quantity) {
		super();
		this.id = id;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", color=" + color + ", quantity=" + quantity + "]";
	}

}
