package com.fsoft.ctc.repository;

import java.util.ArrayList;
import java.util.List;

import com.fsoft.ctc.model.Product;

public class ProductRepository {

	private static List<Product> products = new ArrayList<Product>();
	
	static {
		products.add(new Product("Iphone 10", "White", 10));
	}

	public List<Product> getProducts() {
		return products;
	}

	public void addProduct(Product product) {
		products.add(product);
	}

}
