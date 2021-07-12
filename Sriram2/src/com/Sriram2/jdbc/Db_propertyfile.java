package com.Sriram2.jdbc;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;


public class Db_propertyfile {

	public static void main(String[] args) {
		
		FileInputStream in = null;
		Connection conn = null;
		Statement stmt = null;
		
		try {
			in = new FileInputStream("D:\\Selenium\\Notes\\jdbc.properties");
			Properties prob = new Properties();
			prob.load(in);
			
			String driver = prob.getProperty("jdbc.db_driver");
			String url = prob.getProperty("jdbc.url");
			String username = prob.getProperty("jdbc.db_username");
			String password = prob.getProperty("jdbc.db_password");
			
			Class.forName(driver);
			conn = DriverManager.getConnection(url,username,password);
			stmt = 	conn.createStatement();
			String sql = "select *from departments";
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
			}
			System.out.println("Data fetch successfully...");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(conn != null) {
				try {
					conn.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}

	}

}
