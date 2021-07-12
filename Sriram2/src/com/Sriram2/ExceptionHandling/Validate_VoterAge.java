package com.Sriram2.ExceptionHandling;

import com.Sriram2.CustomException.InvalidAgeException;

public class Validate_VoterAge {

	public static void main(String[] args)  {
		
		int age = 17;
		if(age >=18) {
			System.out.println("Allowed for Voting");
		}else {
			//throw new RuntimeException("Not allowed");
			throw new InvalidAgeException("Not allowed for voting");
		}

	}

}
