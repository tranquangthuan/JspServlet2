package com.fsoft.ctc.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fsoft.ctc.model.Product;
import com.fsoft.ctc.repository.ProductRepository;

@WebServlet(value = "/product-add")
public class NewProductServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/newproduct.jsp");
		dispatcher.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("NewProductServlet - doPost");
		String name = req.getParameter("name");
		String color = req.getParameter("color");
		String quantity = req.getParameter("quantity");
		ProductRepository productRepository = new ProductRepository();
		productRepository.addProduct(new Product(name, color, Integer.valueOf(quantity)));
//		List<Product> products = productRepository.getProducts();
//		req.setAttribute("products", products);
//		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/products.jsp");
//		dispatcher.forward(req, resp);
		resp.sendRedirect("products");
	}

}
