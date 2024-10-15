package com.dest.pattern.day3;

import java.util.Scanner;

public class PatternE {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if((j==0 && i!=0 || i==(n/2) && j<5 || i==0 && j!=0 && j<5 && j!=5 || i==(n-1)&&j!=(n/2) && j<5 )) {	
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

