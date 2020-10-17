package com.syntax.class03;

public class PrimitiveCasting {

	public static void main(String[] args) {
		
		double d=12/7;
		System.out.println(d);
		
		double e=9;//widening,no problem
		System.out.println(e);
		
		int i=(int)9.99;//narrowing /override..has too be done 
		System.out.println(i);
		
		byte b=(byte)130;
		System.out.println(b);
	}

}
