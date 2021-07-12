package com.Sriram2.PropertyRead;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyReading {

	public static void main(String[] args) {
		
		FileInputStream in = null;
		try {
			in = new FileInputStream("D:\\Studies--Selenium\\sample.properties");
			Properties prob = new Properties();
			prob.load(in);
		    String name = prob.getProperty("Name");
			String age = prob.getProperty("Age");
			String location = prob.getProperty("Location");
			String number = prob.getProperty("Number");
			String pincode = prob.getProperty("Pincode");
			String Clocation = prob.getProperty("Current_Location");
			System.out.println("Name: "+ name);
			System.out.println(name);
			System.out.println(age);
			System.out.println(location);
			System.out.println(number);
			System.out.println(pincode);
			System.out.println(Clocation);
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(in !=null) {
				try {
					in.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}

	}

}
