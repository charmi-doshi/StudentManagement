package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.LoginBean;
import com.dao.LoginDao;
import com.sun.tools.javac.util.List;

/**
 * Servlet implementation class StudentCont
 */
public class StudentCont extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
   

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		PrintWriter out = response.getWriter();
		LoginBean bean = new LoginBean();
		LoginDao loginDao = new LoginDao();
	
		
		HttpSession session = request.getSession();
		
		String sName = (String) session.getAttribute("Sname");
		String sPwd = (String) session.getAttribute("Spwd");
		
		out.print("<h1>STUDENTS</h1>");
		List<LoginBean> students=(List<LoginBean>) loginDao.ShowStudents(sName, sPwd);
		for(int i=0;i<students.length();i++)
		{
			out.print(students);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
