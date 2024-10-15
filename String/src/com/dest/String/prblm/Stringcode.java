package com.dest.String.prblm;

public class Stringcode {

	public static void main(String[] args) {
		String str = "RajaRamMohanRoy";
		int res1 = str.length();
		System.out.println("The length of the string "+ res1);
		String res2 = str.toUpperCase();
		System.out.println("The uppercase "+res2);
		String res3 = str.toLowerCase();
		System.out.println("The Lower case " + res3);
		boolean res4 = str.startsWith("Raja");
		System.out.println(res4);
		boolean res5 = str.endsWith("Roy");
		System.out.println(res5);
		boolean res6 = str.contains("Mohan");
		System.out.println(res6);
		
	}

}
