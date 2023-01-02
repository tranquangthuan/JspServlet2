package com.vn.fsoft.ctc.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter(value = "/*")
public class LoginFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		System.out.println("Login Filter");
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		String servletPath = req.getServletPath();
		if ("/login".equalsIgnoreCase(servletPath) || servletPath.endsWith("jsp")) {
			chain.doFilter(request, response);
			return;
		} else {
			HttpSession session = req.getSession(false);
			if ((session != null && session.getAttribute("user") != null) || getUserCookies(req)) {
				chain.doFilter(request, response);
			} else {
				resp.sendRedirect("login");
			}
		}
	}

	private boolean getUserCookies(HttpServletRequest req) {
		Cookie[] cookies = null;
		cookies = req.getCookies();
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				if (cookie.getName() == "user" || cookie.getValue() != "") {
					System.out.println(cookie);
					return true;
				}
			}
		} else {
			System.out.println("Not Cookie");
			return false;
		}
		return false;
	}

	@Override
	public void destroy() {
	}

}
