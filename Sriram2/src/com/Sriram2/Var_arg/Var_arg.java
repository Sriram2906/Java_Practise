package com.Sriram2.Var_arg;

public class Var_arg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Var_arg vd = new Var_arg();
		vd.getNameinfo(new String[]{"Sri","Ram","Sai"});
		vd.getLocationinfo(25,23,"CHENNAI","Salem","Sankarankoil");
		vd.getLocationinfo("Sriram");
		
		
		
	}
	
	public void getNameinfo(String[] name) {
		System.out.println(name[0]+" "+name[1]+" "+name[2]);
		
	}
	
	
	
	public void getLocationinfo(String name) {
		
		System.out.println(name);
		
		
	}
	     
	public void getLocationinfo(int age,int age1,String... Location) {
		
		System.out.println(Location[0]+" "+Location[1]+" "+Location[2]);
		System.out.println(age);
		System.out.println(age1);
		
	}

	}


