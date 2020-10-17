package com.syntax.class06;

import java.util.Scanner;

abstract class SwitchCaseIntro {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a day number");
		int day = scan.nextInt();
		
		if(day == 1) {
			System.out.println("Today is Monday we have no class");
		}else if (day == 2) {
			System.out.println("Today is Tuesday we have Manuel class");
		}else if (day == 3) {
			System.out.println("Today is Wednesday and we habe Manuel class again");
		}else if (day == 4) {
			System.out.println("Today is Thursday and we have review class");
		}else if (day == 5) {
			System.out.println("Today is Friday but I have class tomorrow and i will prepare");
		}else if (day == 6) {
			System.out.println("Today is Saturday, I muss Java classes");
		}else if (day ==7)  {
			System.out.println("Today is Sunday, I did a lot of coding");
		}else {
			System.out.println("This is invalid entry, please provide valid day from 1 to 7");
		}
		
		 System.out.println("-----Same example using switch case---------");
		 String today;
		 switch(day) { //datatype of variable must match with datatype of cases
		 
		 case 1:
			 today="Monday";
			 break;
		 case 2:
		     today="Tuesday";
		     break;
		 case 3:
			 today="Wednesday";
			 break;
		 case 4:
			 today="Thursday";
			 break;
		 case 5:
			 today="Friday";
			 break;
		 case 6:
			 today="Saturday";
			 break;	
		 case 7:
			 today="Sunday";
			 break;
		 }
	}

}
