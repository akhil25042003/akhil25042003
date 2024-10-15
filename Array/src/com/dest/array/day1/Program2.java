package com.dest.array.day1;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the college count: ");
		int col = sc.nextInt();
		System.out.println("Enter the class count in each college: ");
		int cls = sc.nextInt();
		int arr[][] = new int[col][cls];
		for(int i=0; i<arr.length;i++) {
			System.out.println("Inside the college No: "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the seating capacity Inside the class no: "+(j+1));
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0; i<arr.length;i++) {
			System.out.println("Inside the college No: "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("The seating capacity Inside the class no: "+(j+1)+ "is="+arr[i][j]);
			}
		}
	}

}
