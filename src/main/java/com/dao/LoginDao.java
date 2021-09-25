package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.bean.LoginBean;
import com.bean.StudentBean;
import com.controller.DBConnection;

public class LoginDao {

	public boolean flag=false,status=false;
	Connection conn;
	PreparedStatement pstmt;
	List<LoginBean> studentlist=new ArrayList<>();
	LoginBean bean = new LoginBean();
	public boolean b1 = false;
	public boolean b2 = false;
	
	public boolean Login(String Sname,String Spwd)
	{
		conn=DBConnection.getConnection();
		if(conn!=null)
		{
			try {
				System.out.println("login process");
				System.out.println(Sname+Spwd);
				pstmt=conn.prepareStatement("select * from login where sname='"+Sname+"'and spwd='"+Spwd+"';");
				
				ResultSet rs=pstmt.executeQuery();  
				status=rs.next(); 
				System.out.print(status);//debug
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return status;
	}
	public boolean addStudent(LoginBean bean)
	{
		conn = DBConnection.getConnection();
		if(conn!=null)
		{
		   try {
			   System.out.println("register user");
			pstmt = conn.prepareStatement("insert into login(sname,spwd,smail,sadd,snumber) values(?,?,?,?,?)");//query
			
			pstmt.setString(1, bean.getSname());
			pstmt.setString(2, bean.getSmail());
			pstmt.setString(3, bean.getSpwd());
			
			pstmt.setString(4, bean.getSaddress());
			
			pstmt.setInt(5, bean.getSnumber());
			
			int res = pstmt.executeUpdate();
			System.out.println("in method");
			if(res>0)
			{
				flag=true;
				System.out.println("inserted");
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   
		}
		return flag;
	}
	public  boolean validPassword(String Spwd) {
		
		if (Spwd.length() >= 8) {
			Pattern p1 = Pattern.compile("[A-Za-z*_!@#$%^&0-9]+");
			Matcher m1 = p1.matcher(Spwd);
			b1 = m1.matches();
			System.out.println(Spwd.length());
		} else {
			System.out.println("password should be more than 8");
		}

		return b1;
	}
	
	public List<LoginBean> ShowStudents(String Sname,String Spwd)
	{
		studentlist=new ArrayList<>();
		conn = DBConnection.getConnection();
		
		
		if(conn!=null)	
		{
			try {
				System.out.print("show user ");
				System.out.print(Sname);
				System.out.print(Spwd);
				pstmt = conn.prepareStatement("select * from login where sname='"+Sname+"'and spwd='"+Spwd+"';"); //Uname paramter
				
				ResultSet rs = pstmt.executeQuery();
				
				while(rs.next())
				{
					
					bean.setSname(rs.getString(1));
					bean.setSpwd(rs.getString(2));
						studentlist.add(bean);
					System.out.println("in students");
					System.out.println(studentlist);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(studentlist);
		return studentlist;
	}
	public  boolean validEmail(String Smail) {
		

		 

			Pattern p = Pattern.compile("[^ ]+@gmail.com");
			Matcher m = p.matcher(Smail);
			b2 = m.matches();

	
		return b2;
	}

}
