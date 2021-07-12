package com.Sriram2.Collection_concept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Set_list {

	public static void main(String[] args) {
		
		List<String> a_list = new ArrayList<String>();
		a_list.add("Sri");
		a_list.add("Ram");
		a_list.add("Sriram");
		a_list.add("PLC");
		
		//System.out.println("Before sorting"+" "+a_list);
		Collections.sort(a_list);
		//System.out.println("After sorting Ascending"+" "+a_list);
		
		Collections.sort(a_list, Collections.reverseOrder());
		//System.out.println("After sorting descending"+" "+a_list);
		
		/*for(int i=0;i<a_list.size();i++) {
			System.out.println(a_list.get(i));
		}*/
		
		for(String names: a_list) {
			System.out.println(names);
		}
		
		String[] arr = new String[a_list.size()];
		a_list.toArray(arr);
		
		/*for(int j=0;j<arr.length;j++) {
			System.out.println(arr[j]);
		}*/
		for(String namelist:arr)
			System.out.println(namelist);
		
		String[] arr1 = new String[a_list.size()];
		for(int j = 0;j<arr1.length;j++ ) {
			arr1[j] = a_list.get(j);
		System.out.println(arr1[j]);
					
			
	}
		//List<String> a_list_new = new ArrayList<String>(Arrays.asList(arr1));
		List<String> a_list_new1 = new ArrayList<String>();
		a_list_new1.addAll(Arrays.asList(arr1));
		System.out.println(a_list_new1);
		//System.out.println(a_list_new);
		
		for(String a_listt:a_list_new1)
			System.out.println(a_listt);
		
		Set<String> s_set = new HashSet<String>();
		
		s_set.add("a");
		s_set.add("b");
		s_set.add("c");
		s_set.add("d");
		s_set.add("e");
		
		System.out.println(s_set);
		
		String[] arr_convert = new String[s_set.size()];
		s_set.toArray(arr_convert);
		
		for(String letters : arr_convert)
			System.out.println(letters);
		
		
		
		}

}
