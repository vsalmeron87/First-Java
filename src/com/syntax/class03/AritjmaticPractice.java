package com.syntax.class03;

public class AritjmaticPractice {

	public static void main(String[] args) {
		
		int num1, num2;
		
		num1=100;
		num2=200;
		System.out.println(num1+num2);
		
		int result=num1-num2;
		System.out.println(result);
		  
		int what=10+10*10;//multiplication priority over addition
		System.out.println(what);
		
		int what1=(10+10)*10;//parenthesis always priority in problem
		System.out.println(what1);
		
		double d=12.99;
		double e=2.5;
		
		double div=d/e;
		System.out.println("Division of 2 double values"+div);
		
		int a=12;
		int b=7;
		
		System.out.println(a/b);//int always going to give you whole number 
		
		int result1=a/b;
		System.out.println("Division of 2 int values="+result1);
		
		System.out.println("Remainder = "+a%b);
		
		
		
		
	}

}