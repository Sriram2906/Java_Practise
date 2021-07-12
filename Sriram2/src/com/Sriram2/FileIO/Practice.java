package com.Sriram2.FileIO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Practice {
	public static void main(String[] args) {
		FileReader Reader = null;
		FileWriter Writer = null;
	
		
		try {
			Reader = new FileReader("Original.txt");
			 Writer = new FileWriter("Duplicate.txt");
			int data = 0;
			while((data = Reader.read()) !=-1) {
			Writer.write(data);
			}
			System.out.println("Content copied to Duplicate file");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(Reader !=null) {
				try {
					Reader.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
		}if(Writer !=null) {
			try {
				Writer.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		

	}

}}}
