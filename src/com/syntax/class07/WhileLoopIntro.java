package com.syntax.class07;

public class WhileLoopIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int time = 15;
		
		if (time > 12) {//code executes true
			 System.out.println("good day");// code executes 1 time
			 
		}
		 System.out.println("-----------------While loop---------");
		 
		 while (time > 12) {
			 System.out.println("good day");//infinite loop
			 time--;
		 }
		 while (time >12) {
			 System.out.println("good day");
			 time--;
		 }	 
			 // i want to print numbers 1-50
			 System.out.println("Printing Numners 1 to 50"); 
			 int num=1;
			 
			 while(num<50) {
				 System.out.println(num);
				 num++;
			 
		 }
			 //want to print 1-60
			 int a=10;
			 
			 while(a<=60 ) {
				 System.out.println(a+ " ");
				 a++;
			 }
			 // want to print 100-60
			 System.out.println(" Printing numbers 100 to 60 ------------------");
			 
			 int b=100;
			 
			 while(b>=60) {
				 System.out.println(b+" ");
				 b--;
				 
			 }
			 System.out.println("Printing numbers 10 to 30 only even----------");
			 
			 int c=10;
			 
			 while(c<31) {
				 
			 if (c%2==0) {
					System.out.println(c+" ");
				//c++---> if we keep increment here, we will get infinite loop
				 }
				 
			 
			 }
			 
	}
}
	

