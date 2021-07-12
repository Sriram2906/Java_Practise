package com.Sriram2.wrapperclasses;

public class Number_type {

	public static void main(String[] args) {


		Byte b = 127;
		//Short s = b.shortValue();
		//String s = b.toString();
		System.out.println(b.toString());
		
		//compare to
		
		
		
		Short sh1 = 12551;
		Short sh2 = 12556;
		System.out.println(sh1.compareTo(sh2));
		
		if(sh1.compareTo(sh2) == 0)
			System.out.println("The values are same...");
		else if(sh1.compareTo(sh2) >= 1)
			System.out.println("Left side value is greater than right side value...");
		else if(sh1.compareTo(sh2) <= -1)
			System.out.println("Left side value is less than the right one...");
		
		//equals to
		  
		Integer i1 = 1212;
		Integer i2 = 1212;
	    System.out.println(i1.equals(i2));
	    
	    //parse
	    String str = "88";
	   System.out.println(Byte.parseByte(str));

	   // System.out.println(Integer.parseInt(str));
	   
	   //round method
	    Double d = 121.56;
	    System.out.println(Math.round(d));
	    
	    String c = "sri";
	    System.out.println(c.toUpperCase());
	    
	    String str1 ="SRIRAM";
	    String str2 = "sriram";
	    System.out.println(str1.equalsIgnoreCase(str2));
	    
	    String name = "Sriram Sriram";
	    System.out.println( name.length());
	    		
	     
	}

	}


