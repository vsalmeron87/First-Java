package com.syntax.class07;

import java.util.Scanner;

public class LuckyClass {

	public static void main(String[] args) {
		//play a lottery where we need to enter numbers from 1to100
				//lucky number is 7
				//keep asking a user to enter a number until entered number is same as lucky number
				
				
				Scanner scan;
				int numberFromUser;
				
				int luckyNumber=7;
				
				scan= new Scanner(System.in);
				
				do {
					System.out.println("Please print any number from range 1 to 100");
					numberFromUser=scan.nextInt();
				}while(numberFromUser!=luckyNumber);
				System.out.println("You guessed number right");
	}

}
