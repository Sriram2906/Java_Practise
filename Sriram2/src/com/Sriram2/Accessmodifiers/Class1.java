package com.Sriram2.Accessmodifiers;

public class Class1 {
	
	public String name = "Sriram";
	private double salary = 100000.0;
	protected String food = "Biriyani";
	String empid = "Empid007";

	public static void main(String[] args) {
		
		Class1 c1 = new Class1();
		System.out.println(c1.name);
		System.out.println(c1.salary);
		System.out.println(c1.empid);
		/*c1.getname();
		c1.getsalary();
		c1.getfood();*/
		
	}
	
	public void getname() {
		System.out.println("methoddd");
	}
	
	//private void getsalary() {
		//System.out.println(salary);
	//s}
	
	protected void getfood() {
		System.out.println(food);
	}

	}


