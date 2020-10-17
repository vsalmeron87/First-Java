package com.syntax.class03;

public class AdditionVsConcatenation {

	public static void main(String[] args) {
		
		int a=100;
		int b=200;
		
		String x="Hello";
		String y="Friends";
		
		System.out.println(a+b+x+y);//300hellofriends
		System.out.println(a+x+b+y);//100hello200friends
		System.out.println(x+y+a+b);//hellofriends100200
		//parenthesis for any operation ()inside//
		//? how to get hellofriends300?? you put in parenthesis ()
		
		System.out.println(x+y+(a+b));
		
		
		
		

	}

}
