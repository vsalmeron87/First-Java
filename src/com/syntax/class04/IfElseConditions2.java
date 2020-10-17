package com.syntax.class04;

public class IfElseConditions2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a=-1;
    System.out.println("This will be printed always");
    if(a>0) {
    	System.out.println("Number is greater than zero");
    }
     System.out.println("This will be printed always");
     
     if(a>0) {
    	 System.out.println("Number is greater than zero");
    	  }else {
    		  System.out.println("Number is greater less than zero");
    	  }
     System.out.println("This line will always be printed");
     
     if(a>0) {
    	System.out.println("Number is greater than zero"); 
    	
     }else if(a<0) {
    	 System.out.println("Number is greater less than zero");
    	 
     }
     System.out.println("This will always be printed");
	}

}
