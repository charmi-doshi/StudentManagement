package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bean.LoginBean;
import com.bean.StudentBean;
import com.controller.DBConnection;

public class StudentDao {

	public boolean flag=false,status=false,bool=false;
	Connection conn;
	PreparedStatement pstmt;
	List<StudentBean> students=new ArrayList<>();
	StudentBean studentbean = new StudentBean();
	LoginBean bean = new LoginBean();
	
	

	public boolean updateStudent(StudentBean studentbean)
	{
		conn = DBConnection.getConnection();
		
		String sname = studentbean.getSname();
		String spwd = studentbean.getSpwd();
		
		if(conn!=null)
		{
		   try {
			   System.out.println("update user");
			   
			   sname = studentbean.getSname();
			    spwd = studentbean.getSpwd();
			pstmt = conn.prepareStatement("UPDATE students SET  sname='"+sname+"' and spwd='"+spwd+"' ;");//query
			
			
//			pstmt.setString(1, userbean.get_Wedtype());
//			pstmt.setString(2, userbean.get_Place());
//			pstmt.setString(3, userbean.get_SpFeature());
//		
//			pstmt.setInt(4, userbean.get_amount());
//			pstmt.setString(5, bean.get_Uname());
//			pstmt.setString(6, bean.get_Upwd());
			int res = pstmt.executeUpdate();
			System.out.println(bean.getSname());
			if(res>0)
			{
				bool=true;
				System.out.println("updated");
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   
		}
		return bool;
	}

}
