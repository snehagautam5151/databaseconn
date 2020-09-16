package com.simlilearn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateConnection {


	
	public static void main(String args ) throws SQLException{
		
		//jdbc connection
		
		    
		String url = "jdbc:mysql://localhost:3306/ecomercedb";
		String username = "root";
		String password = "Sneha12345";
		 
		Connection conn = null;
		Statement stm = null;
		ResultSet rst = null;
		try {
		  // 1. REgister your driver
		     
		Class.forName("com.mysql.jdbc.Driver");

		// 2. Create connection

		   conn = DriverManager.getConnection(url, username,password);

		//3. Create Query

		  String query = "select * from eproduct";

		//4. Create a statement

		 stm = conn.createStatement();

		//5. execute query
		  
		rst = stm.executeQuery(query);

		while (rst.next()) {
		 System.out.println("-------------------");
		   System.out.println(rst.getInt(1) + " " + rst.getString(2) + " " + rst.getDouble(3));
		}

		   
		}  catch (Exception e) {

		} finally {

	//	rst.close();
		stm.close();
		conn.close();
	    }
		 
      }
      }


