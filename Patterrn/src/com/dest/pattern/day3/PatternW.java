package com.dest.pattern.day3;

import java.util.Scanner;

public class PatternW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				
				
				if(j==0 || i+j == n-1 && j<n/2 || i==j && j>n/2 || j==n-1) { 
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
