package com.dest.array.day3;

import java.util.Scanner;

public class Pattern5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count of School: ");
		int scl = sc.nextInt();
		String arr[][][]=new String[scl][][];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the class count in school no: "+(i+1));
			arr[i]=new String[sc.nextInt()][];
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside the class no: "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Inside the class no: "+(j+1));
				System.out.println("Enter the student count: ");
				arr[i][j]=new String[sc.nextInt()];

			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println("inside teh school No");
		}
		
	}

}
