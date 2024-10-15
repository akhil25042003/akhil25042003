//palindrome of string

package com.dest.String.prblm;

import java.util.Scanner;

public class StringCode2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.next(); 
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println("The reverse string is : "+rev);
		if(str.equals(rev)==true) {
			System.out.println("Palindrome");
		}else {
			System.out.println("not Palindrome");
		}
	}

}
