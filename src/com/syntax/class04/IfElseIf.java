package com.syntax.class04;

public class IfElseIf {

	public static void main(String[] args) {
		
	
			
			/* based on the day of the week we will print class schedule
			 *
			 * 
			 */
			int day=99  ;
			if(day==1) {
				System.out.println("Today is Monday we have no class");
			
			}else if(day==2) {
				System.out.println("Today is Tuesday we have Manuel class");
				
			}else if(day==4) {
				System.out.println("Today is Thursday and we have Review Class");
				
			}else if(day==5){
				System.out.println("Today is Friday but I have class tomorrow and will prepare");
				
				
			}else if(day==6) {
				System.out.println("Today is Saturday, I miss Java Classes");
				
			}else if (day==7) {
				System.out.println("Today is Sunday, I did a lot of coding");	
			}else {
				System.out.println("This is ivalid day of the week");
			}
		}
		
	}


