package com.dest.array.day3;

import java.util.Scanner;

public class Program9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n = sc.nextInt();
		int arr1[][]=new int[n][n];
		int arr2[][]= new int[n][n];
		int res[][]=new int[n][n];
		System.out.println("Enter the elements of array1 :");
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1.length;j++) {
				System.out.println("Enterb the value in the position ("+i+","+j+":");
				arr1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the elements of array2 :");
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				System.out.println("Enterb the value in the position ("+i+","+j+":");
				arr2[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1.length;j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1.length;j++) {
				res[i][j]=arr1[i][j]+arr2[i][j];
			}
			System.out.println();
		}
		System.out.println("Resultant array : ");
		for(int i=0;i<res.length;i++) {
			for(int j=0;j<res.length;j++) {
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
	}
}
