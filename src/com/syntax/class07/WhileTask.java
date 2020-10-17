package com.syntax.class07;

public class WhileTask {

	public static void main(String[] args) {
		
		boolean workday=false;
		int day=1;
		
		while(workday) {
	     if(day<6) {
		System.out.println("I need a day off");
		}else {
			System.out.println("It is weekend and i am of");
			workday=false;
		}
	     
	     day++;
		}
	}

}
