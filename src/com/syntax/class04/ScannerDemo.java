package com.syntax.class04;
//control+shift=o
import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=80;
		String str="I am a String";
		
		Scanner scan=new Scanner(System.in);//enables input to the console
		//i am adding some message to the user
		System.out.println("Please enter my txt");
		String value=scan.nextLine();//waits for your input and once you provided input --> hit Enter button
	
		
		System.out.println("I captured value="+value);
		System.out.println("Please enter your name");
		String name=scan.nextLine();
		System.out.println("Nice to meet you "+name);
	}

}
