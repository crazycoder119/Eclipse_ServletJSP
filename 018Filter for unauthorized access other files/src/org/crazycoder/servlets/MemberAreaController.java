package org.crazycoder.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/MemberAreaController")
public class MemberAreaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public MemberAreaController() {

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		switch (action) {
		case "memberarea":
			request.getRequestDispatcher("memberArea.jsp").forward(request, response);
			break;
		case "memberonly":
			request.getRequestDispatcher("memberOnly.jsp").forward(request, response);
			break;
		case "destroy": 
			request.getSession().invalidate();	
			String encode = response.encodeURL(request.getContextPath());
			response.sendRedirect(encode+"/SiteController?action=login");
			 break;
		default:
			break;
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
