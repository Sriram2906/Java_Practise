package com.Sriram2.Var_arg;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sample s = new Sample();
		/*s.getName("Sriram");*/
		s.getName(new String[]{"Ram","Sri","Sai"});
	}
		

	
      /* public void getName(String name) {
    	   System.out.println(name);
       }*/
       
       public void getName(String[] name) {
    	   System.out.println(name[0]+" "+name[1]+" "+name[2]);

	}

}
