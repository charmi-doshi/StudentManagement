package com.controller;

import java.io.IOException;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.bean.LoginBean;
import com.bean.StudentBean;
import com.dao.LoginDao;

/**
 * Servlet implementation class LoginServController
 */
public class LoginServController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	static List<LoginBean> studentlist = new ArrayList<LoginBean>();
    static public List<LoginBean> getList()
    {
   	 return studentlist;
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		//from login to homepage then to add to cart 
		String Sname =request.getParameter("txtUsername");
		String Spwd = request.getParameter("pwdUserPwd");
		
		PrintWriter out = response.getWriter();
		LoginBean bean = new LoginBean();
		LoginDao loginDao = new LoginDao();
	
		
		HttpSession session = request.getSession();
		response.setContentType("text/html");
		if(loginDao.Login(Sname, Spwd)){  
			session.setAttribute("Sname", Sname);
			session.setAttribute("Spwd", Spwd);
			
			
//			bean.set_Upwd(Upwd);
//			
//			userlist.add(userbean);
//			System.out.println(userlist);
			
			
	        //request.setAttribute("studentlist", studentlist);
		    
		 //   List<LoginBean> choices= (List)service2.ShowUserchoice(Sname, Spwd);
		  //  session.setAttribute("choices", choices);
	        RequestDispatcher rd=request.getRequestDispatcher("Home.jsp");  
	        rd.forward(request,response);  
	    }  
	    else{  
	        out.print("Sorry username or password error");  
	        RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");  
	        rd.include(request,response);  
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
