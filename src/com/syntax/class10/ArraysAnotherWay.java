package com.syntax.class10;

public class ArraysAnotherWay {

	public static void main(String[] args) {
	
		String[] names= {"Mike", "Burju" , "Jack", "Danilo", "Brian", "Evgenia"};
		
		//String[] names;
		//name={"Sabeen"}; we cannot do it in 2 steps like this
		
		System.out.println(names[3]);
		
		//how do i know how many elements i have in the array??
		 int size=names.length;
		 System.out.println("Size of array="+size);
		 
		 System.out.println(names[names.length-2]);//danilo
		 
		 int a=2;
		 System.out.println(names[a]);//jack
		 
		 a+=2;
		 System.out.println(names[a]);//brian
		 
		 
		 for(int i=0; i<names.length; i++) {
			 
			 System.out.println(names[i]);
		 }
		 
		 System.out.println("---------------------------");
		 for (int i = 0; i <= names.length; i++) {
			 System.out.println(names[i]);
			 
		 }
	}

}
