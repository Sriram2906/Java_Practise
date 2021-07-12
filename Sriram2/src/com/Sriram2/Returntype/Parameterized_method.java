package com.Sriram2.Returntype;

public class Parameterized_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parameterized_method pm = new Parameterized_method();
		pm.addTwoValues(10,20); // Argument Passing...
		getName("Srii");
		
		
		
		

	}
	public void addTwoValues(int a,int b) {  // Parameter...
	
        int c = a + b;
        System.out.println(c);
	}
	
	public static void getName(String name) {
		System.out.println(name);

	}

}
