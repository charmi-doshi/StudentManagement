package com.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	//list.jsp
	
	private static String userName = "postgres";
	private static String password = "1234";
	private static String DriverClass = "org.postgresql.Driver";
	private static String connectionURL = "jdbc:postgresql://localhost:5434/students";

	public static Connection getConnection() {

		Connection conn = null;

		try {
			Class.forName(DriverClass);

			conn = DriverManager.getConnection(connectionURL, userName, password);

			if (conn != null) {

				System.out.println("connected to database..");
			} else {

				System.out.println("something went wrong..");

			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}

	public static void main(String[] args) {

		getConnection();
	}

}
