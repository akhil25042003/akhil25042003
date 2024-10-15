package com.dest.String.prblm;

import java.util.Scanner;

public class Program14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input");
		String str = sc.nextLine();
		System.out.println(str);
		String[] words = str.split(" ");
		String rev = "";
		for(int i = 0; i<words.length; i++) {
			String word = words[i];
			String revword = "";
			
			for(int j=word.length() - 1;j>=0;j--) {
				revword = revword+word.charAt(j);
			}
			rev = rev + revword  + " ";
		}
		System.out.println(rev);
	}

}
