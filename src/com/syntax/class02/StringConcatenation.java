package com.syntax.class02;

public class StringConcatenation {

	public static void main(String[] args) {
	
		String name="Olga";
		
		//I would like to say my name is Olga
		
		System.out.println("My name is "+name);
		
		String lastName="Sorrels";
		
		//I would like to print Olga Sorrels
		
		System.out.println(name+" "+lastName);
		
		String city="Miami";
		//Olga lives in Miami
		System.out.println(name+" lives in "+city);
		
		char grade='B';
		//Olga is B student
		System.out.println(name+" is a "+grade+" student");
		
		int age=21;
			//olga is 21 years old
		System.out.println(name+" is " +age+ " years old"); 
		/*
		 *to attach//concatenate Any value(char,int,String,dbl) 
		 to a String we use + (String concatenation operator)
		 */
		
		int date=27;
		String month="september"; 
		System.out.println(date+ " of "+ month);
		
		String state="DC";
		String anotherState="DC ";
		//above Strings has 2 characters amain
		

	}

}
