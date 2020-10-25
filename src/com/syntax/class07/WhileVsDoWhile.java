package com.syntax.class07;

public class WhileVsDoWhile {

	public static void main(String[] args) {
		
		int a=15;
		//first we check condition
		while(a<15) {
			System.out.println("Hello");//do something
			a++;
		}
		System.out.println("-----------do while loop");
		
	int b=20;
	//first do something
	do {
		System.out.println("Hi");
		b++;
	}while(b<15);//then check condition
	
	}

}
