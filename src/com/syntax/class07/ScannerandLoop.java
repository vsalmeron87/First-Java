package com.syntax.class07;

import java.util.Scanner;

public class ScannerandLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//asks user what his name 5 times--> hella +name
		
		Scanner scan;
		String name;
		
		scan=new Scanner(System.in);
		
		int num=1;
		
		int number=1;
		while(number<=5) {
			
		System.out.println("Please tell me your name");
		name=scan.nextLine();
		System.out.println("Nice to meet you "+name);
		System.out.println("-----------");
		number++;
		}
		System.out.println("-------------------------------");
		//play a lottery where we need to enter numbers from 1to100
		//lucky number is 7
		//keep asking a user to enter a number until entered number is same as lucky number
		
		
		
		
	}

}
