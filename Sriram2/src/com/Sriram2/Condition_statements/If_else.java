package com.Sriram2.Condition_statements;

public class If_else {

	public static void main(String[] args) {
		
		
String Employee = "emp5";
		
		if(Employee == "emp1") {
			System.out.println("Sriram");
			if(Employee == "emp1") {
				System.out.println("First place");
			}
		}else if(Employee == "emp2") {
			System.out.println("Ranjith");
			if(Employee=="emp2") {
				System.out.println("Second place");
			}
		}else if(Employee == "emp3") {
			System.out.println("Siva");
			if(Employee=="emp3") {
				System.out.println("Third place");
				System.out.println("Need to improve");
			}
		}else if(Employee == "emp4") {
			System.out.println("Thiru");
			if(Employee=="emp4") {
				System.out.println("Fourth place");
				System.out.println("Need to improve a lot....");
			}
		}else {
			System.out.println("None of the Above");
		}
		
		/*int a = 10;
		int b = 9;
		int c = 30;
		
		if(a<b && a>c) {
			System.out.println("A is less than B");
		}else if(a<c&&a<b) {
			System.out.println("A is not less than B...But less than C");
		}else {
			System.out.println("None");
		}*/

	}

}
