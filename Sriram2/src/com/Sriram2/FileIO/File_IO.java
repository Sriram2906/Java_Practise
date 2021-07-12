package com.Sriram2.FileIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class File_IO {
	
	//static FileInputStream in;
		//static FileOutputStream out;

	public static void main(String[] args) {
		
		FileInputStream in = null;
	    FileOutputStream out = null;
		
	
		try {
			 in = new FileInputStream("Input.txt");
			 out = new FileOutputStream("Output.txt");
			int data = 0;
			while((data=in.read()) !=-1) {
				out.write(data);
			}
			System.out.println("Data copied successfullyyy....");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(in !=null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}if(out !=null) {
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		

	}

	}


