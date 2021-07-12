package com.Sriram2.Variables;

public class Main_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Variable_demo vd = new Variable_demo();
		
		String name = vd.name;
		byte age = vd.age;
		String location = vd.location;
	   final String myempID = vd.myempID;
		
		
		
		System.out.println(name);	
		System.out.println(age);
		System.out.println(location);
		System.out.println(myempID);
		
		
		String s = "Kumar" + "revathy";
		String splitStr = "fgdfgdf_Delivery _ In 4 - 5 days";
		
		String[] arrStr = splitStr.split("_");
		System.out.println(arrStr[1]);
		for(String tst : arrStr) {
			if(!tst.equals("Delivery")) {
			System.out.println(tst);
			}
		}

	}

}
