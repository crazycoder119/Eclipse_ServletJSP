package org.crazycoder.servlets;

import java.io.IOException;
import java.io.PrintWriter;

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

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		response.getWriter().print("Name : " +request.getParameter("name") + "<br>");
//		response.getWriter().print("Gender : " +request.getParameter("gender") +"<br>");
//		response.getWriter().print("Language : ");
//		String [] countries = request.getParameterValues("language");
//		PrintWriter out = response.getWriter();
//		if(countries != null){
//		for(String lang : countries){
//			out.println(lang);
//		}
//		}else{
//			out.println("No language is selected");
//		}
//		response.getWriter().print("<br>");
//		response.getWriter().print("Country : " +request.getParameter("country") +"<br>");
		
		request.getRequestDispatcher("submit.jsp").forward(request, response);
	}

}
