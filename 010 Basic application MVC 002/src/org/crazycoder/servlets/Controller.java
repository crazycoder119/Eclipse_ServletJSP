package org.crazycoder.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Controller() {

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String param = request.getParameter("page");
		switch (param) {
		case "login":
			request.getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
			break;
		case "signUp":
			request.getServletContext().getRequestDispatcher("/signUp.jsp").forward(request, response);
			break;
		case "about":
			request.getServletContext().getRequestDispatcher("/about.jsp").forward(request, response);
			break;
		default:
			request.getServletContext().getRequestDispatcher("/notFound.jsp").forward(request, response);
			break;
		}
	}

}
