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
public class SiteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public SiteController() {

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Reading username and password
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		if(username.equals("admin")&& password.equals("admin")) {
			//Invalidate the previous sessions
			request.getSession().invalidate();
			HttpSession newSession = request.getSession(true);
			newSession.setMaxInactiveInterval(300);
			Cookie cUsername = new Cookie("username", username);
			response.addCookie(cUsername);
			response.sendRedirect("memberArea.jsp");
			
		} else {
			response.sendRedirect("login.jsp");
		}
	}
}
