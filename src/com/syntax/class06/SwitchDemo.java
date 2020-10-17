package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		/*
		 * Lets ask a tester on which browser they would like to use
		 * 
		 * 
		 */

		Scanner scan;
		String browser;
		String message;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter a browser");
		browser=scan.nextLine();
		
		switch(browser) {
		
		case "safari":
			message="Your code will be executed on safari";
			break;
		case "chrome":
			message="Your code will be executed on Chrome";
			break;
		case "firefox":
			message="Your code will be executed on firefox";
			break;
			default:
				message="entered browser is invalid";
				
				
		}
		System.out.println(message);
		
	}

}
