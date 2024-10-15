package com.dest.String.prblm;

import java.util.Scanner;

public class Program12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input ");
		String str = sc.nextLine();
		String stirng1 = "";
		String string2 = "";
		String string3 = "";
		for(int i = 0;i<str.length();i++) {
			if(Character.isDigit(str.charAt(i))) {
				string1++;
			}else if(Character.isAlphabetic(str.charAt(i))){
				string2++;
			}
			else {
				string3++;
			}
		}
	}

}
