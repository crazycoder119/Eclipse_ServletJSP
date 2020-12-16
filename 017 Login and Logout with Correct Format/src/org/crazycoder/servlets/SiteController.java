package org.crazycoder.servlets;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/SiteController")
/**
 * We are using seperate controller for public pages
 * Seperate controller for member pages
 * @author TryMe
 *
 */
public class SiteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public SiteController() {

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		
		switch (action) {
		case "login":
			request.getRequestDispatcher("login.jsp").forward(request, response);
			break;

		default:
			break;     
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		switch (action) {
		case "loginsubmit":
			authenticate(request, response);
			break;

		default:
			break;
		}
	}
	
	public void authenticate(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// Reading username and password
				String username = request.getParameter("username");
				String password = request.getParameter("password");
				if(username.equals("admin")&& password.equals("admin")) {
					//Invalidate the previous sessions
					request.getSession().invalidate();
					HttpSession newSession = request.getSession(true);
					newSession.setMaxInactiveInterval(300);
					newSession.setAttribute("username", username);
					response.sendRedirect(request.getContextPath()+"/MemberAreaController?action=memberarea");
					
				} else {
					response.sendRedirect(request.getContextPath()+"/SiteController?action=login");
				}
	}
	
	
}
