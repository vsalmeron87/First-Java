package com.syntax.class10;

public class AllValuesFromArray {

	public static void main(String[] args) {
		
		String[] cars = {"Maserati", "Lamborghini", "Lexus", "Mercedes", "Infiniti", "Volkswagon"};
		
		for (int a= 0; a<cars.length; a++) {
			System.out.println(cars[a] + " ");
		}
		
		System.out.println();
		
		System.out.println("------- getting values from arra using enhanced for loop-----");
		
		int[] numbers= {10, 10, 90, 600, 89};
		
		for(int num :numbers) {
			System.out.println(num);
		}
		
		System.out.println();
		System.out.println("------- getting values from arra using enhanced for loop-----");
		
		boolean[] arrayofBoolean= {true, true, false, true};
		
		for(Boolean boo:arrayofBoolean) {
			System.out.println(boo);
		}
		
	}

}
