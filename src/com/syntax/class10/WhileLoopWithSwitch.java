package com.syntax.class10;

import java.util.Scanner;

public class WhileLoopWithSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1;
		int num2;
		char operation;
		double results;
		boolean continueLoop=true;
		String end;
		
		while(continueLoop) {
			
		
		System.out.println("PLease enter two numbers");
		Scanner scanner =new Scanner(System.in);
		num1=scanner.nextInt();
		num2=scanner.nextInt();
		System.out.println("Please enter the operation = - * /");
		operation=scanner.next().charAt(0);
		switch(operation) {
		case'+':
		results = num1 + num2;
		break;
		case'-':
		results = num1 +num2;
		break;
		case'*':
		results = num1 + num2;
		break;
		case'/':
		results = num1 + num2;
		break;
		default:
		results =0;

		}
		System.out.println("Results are " + results);
		System.out.println("Enter Yes to perform more operations and No to terminate the program");
		end=scanner.next();
		if("No".equals(end));{
			continueLoop=false;
		}
	}

}
}
