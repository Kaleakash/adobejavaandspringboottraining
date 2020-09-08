package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SimpleDemo
 */
public class SimpleDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SimpleDemo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**		init(), service(), destroy() 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = response.getWriter();
		String user = request.getParameter("user");
		String pass = request.getParameter("pass");
		if(user.equals("Raj") && pass.equals("Deep")) {
			pw.println("Successfully Login! with Get");
		}else {
			pw.println("Failure try once again!");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = response.getWriter();
		String user = request.getParameter("user");
		String pass = request.getParameter("pass");
		if(user.equals("Raj") && pass.equals("Deep")) {
			pw.println("Successfully Login! with Post");
		}else {
			pw.println("Failure try once again!");
		}
	}

}
