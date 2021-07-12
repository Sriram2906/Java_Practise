package com.Sriram2.Collection_concept;

import java.util.ArrayList;
import java.util.List;

public class Practiselist {

	public static void main(String[] args) {
		
List<String>arr_list = new ArrayList<String>();
		
		arr_list.add("A");
		arr_list.add("B");
		arr_list.add("C");
		arr_list.add("D");
		
		//Collections.sort(arr_list);
		
		//for(int i = 0;i<arr_list.size();i++)
		//	System.out.println(arr_list.get(i));
			
	   String[] arr_convert = new String[arr_list.size()];
	   arr_list.toArray(arr_convert);
	   
	   for(int i = 0;i<arr_convert.length;i++)
		  System.out.println(arr_convert[i]);
	  
	     /*int i = 0;
	     while(i<arr_convert.length) {
	    	 System.out.println(arr_convert[i]);
	    	 i++;
	     }*/
	    
		/*int i = 0;
		while(i<arr_convert.length) {
			arr_convert[i] = arr_list.get(i);
			System.out.println(arr_convert[i]);
			i++;
		}*/
	   int j = 0;
		do {
			
			System.out.println(arr_convert[j]);
			j++;
		}while(j<arr_convert.length);

	}

	}


