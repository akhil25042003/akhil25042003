package com.dest.pattern.day4;

import java.util.Scanner;

public class Pattern31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value ");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			int count =i;
			for(int j=0; j<n;j++) {
				if(count<10) {
					System.out.print("0");
					System.out.print(count);
					System.out.print("  ");
					count = count+5;
				}
				else {
					System.out.print(count);
					System.out.print(" ");
					count=count+5;
				}
			}
			
			System.out.println();
		}


	}

}
