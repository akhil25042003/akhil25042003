package com.dest.pattern.day4;

import java.util.Scanner;

public class pattern30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value ");
		int n = sc.nextInt();
//		int n=5;
		int count =1;
		for(int i=0;i<n;i++) {
			for(int j=0; j<n;j++) {
				if(count<10) {	
					System.out.print("0");
					System.out.print(count);
					System.out.print("  ");
					count++;
				}
				else {
					System.out.print(count);
					count++;
				}
			}
			
			System.out.println();
		}


	}

}
