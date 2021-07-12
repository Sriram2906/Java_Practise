package com.Sriram2.Encapsulation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student_info info = new Student_info();
		String studentname = info.getStudentname();
		String studentlocation = info.getStudentloaction();
		int studentage = info.getStudentage();
		
		System.out.println(studentname);
		System.out.println(studentlocation);
		System.out.println(studentage);

	}

}
