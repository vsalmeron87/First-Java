package com.syntax.class04;

public class Nestedif {

	public static void main(String[] args) {
		
		
			System.out.println("---------example 2-----------------");
			
			/*
			 * if todays Friday we will watch movie but would like to check the date
			 * 
			 * 		if date is 13--> watching scary movie
			 *      and if it not--> I will watch comedy, action
			 *      if no Friday--> I am studying
			 */
			
			boolean isFriday=true;
			int date=(13);
			
			if(isFriday) {
				if(date==13) {
					System.out.println("I will watch scary movie");
				}else {
					System.out.println("I will watch PK movie w amir khan");
				}
			}else {
				System.out.println("Today is not Friday, I am studying");
			}

		}
	
		
	}


