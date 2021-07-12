package com.Sriram2.Collection_concept;

import java.util.HashMap;
import java.util.Map;

public class Map_practise {

	public static void main(String[] args) {
		
		
		Map<String, String> m_map = new HashMap<String, String>();
		//Map<String,String> m_map = new LinkedHashMap<String, String>();
		//Map<String, String> m_map = new TreeMap<String, String>();
		
		m_map.put("Name", "Sriram");
		m_map.put("Age","25");
		m_map.put("Location", "Sankarankoil");
		m_map.put("Pincode", "627756");
		
		System.out.println(m_map);
		
		for(Map.Entry<String, String> data : m_map.entrySet()) {
			System.out.println(data.getKey()+" = "+data.getValue());
		}

	}

}
