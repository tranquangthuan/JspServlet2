package com.fsoft.ctc.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fsoft.ctc.model.User;

@WebServlet(value = "/login")
public class LoginServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Login do get");
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/login.jsp");
		dispatcher.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Login doPost");
		String userName = req.getParameter("userName");
		String password = req.getParameter("password");
		System.out.println(userName);
		System.out.println(password);
		if ("admin".equals(userName) && "admin".equals(password)) {
			User user = new User(userName, password);
			req.setAttribute("user", user);
			req.setAttribute("name", "thuan");
			RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/welcome.jsp");
			dispatcher.forward(req, resp);
//			HttpSession session = req.getSession();
//			String al = "am session variable";
//			session.setAttribute("al", al);
//			resp.sendRedirect("welcome");
		} else {
			RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/login.jsp");
			dispatcher.forward(req, resp);
		}
	}

}
