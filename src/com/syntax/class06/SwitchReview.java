package com.syntax.class06;

import java.util.Scanner;

public class SwitchReview {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		char operation;
		int results=0;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter two numbers");
		num1=scan.nextInt();
		num2=scan.nextInt();
		System.out.println("PLease enter the operation + _ / *");
		operation=scan.next().charAt(0);
		
		if(operation=='+') {
			results=num1+num2;
		}else if (operation=='-') {
			results=num1-num2;
		}else if (operation=='*') {
			results=num1*num2;
		}else if (operation=='/') {
			results=num1/num2;
		}else {
			System.out.println("Invalid Opoeration");
		}
		
		System.out.println(results);
		
		switch(operation) {
		case'+':
			results=num1+num2;
			break;
		case'-':
			results=num1-num2;
			break;
		case'*':
			results=num1*num2;
			break;
		case'/':
			results=num1/num2;
			break;
			default:
				System.out.println("Invalid operation");
			
		}
	}

}
