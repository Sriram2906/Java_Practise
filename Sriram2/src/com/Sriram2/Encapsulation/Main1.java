package com.Sriram2.Encapsulation;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer_private cp = new Customer_private();
		 
		
		
	     new Customer_info(cp);
		
		System.out.println(cp.getCustomername());
		System.out.println(cp.getAccountnumber());
		System.out.println(cp.getAccountpin());

	}

}
