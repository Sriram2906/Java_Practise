package com.Sriram2.Polymorphism;

public class Method_Overloading {

	public static void main(String[] args) {
		getSriramInfo("Sriram");
		getSriramInfo("TN","Male");
	}
		public static void getSriramInfo(String name) {
			System.out.println(name);
		}
		
		public static void getSriramInfo(String state, String gender) {
			System.out.println(state + "&" +gender);
		}

	

}
