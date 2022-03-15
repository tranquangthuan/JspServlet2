package com.fsoft.ctc.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fsoft.ctc.model.User;

@WebServlet(value = "/profile")
public class ProfileServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// super.doGet(req, resp);
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		HttpSession session = req.getSession();
		if (session != null && session.getAttribute("user") != null) {
			User name = (User) session.getAttribute("user");
			out.print("Hello, " + name.getUserName() + " Welcome to Profile");
		} else {
			out.print("Please login first");
			req.getRequestDispatcher("/WEB-INF/views/login.jsp").include(req, resp);
		}
		out.close();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// super.doPost(req, resp);
	}

}
