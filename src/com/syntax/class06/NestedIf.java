package com.syntax.class06;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String pass="pas123";
		double accountBalance=1000;
		Scanner scan=new Scanner(System.in);
		double transferAmount=500;
		System.out.println("Welcome to Syntax Please enter your password");
		pass=scan.nextLine();
		
		if("pass123".equals(pass)) {
			System.out.println("Please enter the amount you want to deposit");
			transferAmount=scan.nextDouble();
			if(transferAmount>accountBalance) {
				System.out.println("Not enough funds");
			}else {
				System.out.println("Transfered remaining balance" + (accountBalance-transferAmount));
			}
			

		}else {
			System.out.println("Sorry try again, Invalid credetials");
		}
		

	}

}
