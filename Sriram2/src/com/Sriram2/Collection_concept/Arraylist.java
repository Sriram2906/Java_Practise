package com.Sriram2.Collection_concept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {
		
		/*String[] str = new String[6];
		str[0] = "s";
		str[1] = "r";
		str[2] = "i";
		str[3] = "r";
		str[4] = "a";
		str[5] = "m";*/
		
		//ArrayList<String> arr_list = new ArrayList<String>();
		List<String>arr_list2 = new ArrayList<>();
		List<Integer>arr_list3 = new ArrayList<>();
		
		arr_list2.add("Sriram");
		arr_list2.add("Ram");
		arr_list2.add("Sri");
		arr_list3.add(12);
		arr_list3.add(45);
		
		//Collections.sort(arr_list2, Collections.reverseOrder());
		
		
		String [] arr_convert = new String[arr_list2.size()];
		arr_list2.toArray(arr_convert);
		
		for(int i = 0 ; i<arr_convert.length;i++) {
			//System.out.println(arr_convert[i]);
		}
		
		String[] arr_convert2 = new String[arr_list2.size()];
		for(int j = 0;j<arr_convert2.length;j++) {
			arr_convert2[j]= arr_list2.get(j);
			//System.out.println(arr_convert2[j]);
		}
	
		
		
		//System.out.println(arr_list2.size());
		//System.out.println(arr_list2);
		
		/*for(String names:arr_list2) {
			System.out.println(names);
		}
		/*for(Integer num:arr_list3) {
			System.out.println(num);
		}*/
		
		//List<String>arr_list4 = new ArrayList<String>(Arrays.asList(arr_convert2));
		//System.out.println(arr_list4);
		
		List<String>arr_list4 = new ArrayList<String>();
		arr_list4.addAll(Arrays.asList(arr_convert2));
		System.out.println(arr_list4);
		
		//for(String data : arr_convert2)
		//	System.out.println(data);
		//for(int i = 0;i<arr_list4.size();i++)     
			//System.out.println(arr_list4.get(i));
		int j = 0;
		while(j<arr_list4.size()) {
			//System.out.println(arr_list4.get(j));
			j++;
	}


	}

}
