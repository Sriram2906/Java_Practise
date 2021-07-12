package com.Sriram2.Returntype;

public class Returntype {

	public static void main(String[] args) {
		
		Returntype rt = new Returntype();
		String location = rt.sendLocationDetails();
	    rt.sendAgeDetails();
		sendVotingparty();
		
		
		 
		
		
		if(location=="Chennai") {
			System.out.println("From Chennai");
		}else {
			System.out.println("Not from Chennai");
		}
	}
	
	public String sendLocationDetails() {
		String location = "Chennai";
		return location;
		
		
		
	}
	
	public void sendAgeDetails() {
		System.out.println("Age is 25");
	}
	
	public static void sendVotingparty() {
		System.out.println("Makkal Needhi Maiam");
	}

	

}
