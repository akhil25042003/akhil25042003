package com.dest.array.day2;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the college count: ");
		int col = sc.nextInt();
		int arr[][] = new int[col][];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the class count in college"+(i+1));
			arr[i]= new int[sc.nextInt()];
		}
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
