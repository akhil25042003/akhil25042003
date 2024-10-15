package com.dest.array.day1;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the student count: ");
		int n = sc.nextInt();
		//creating a dynamic array of size n
		int arr[] = new int[n];
		//
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the marks of student no: "+(i+1));
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the marks of student no: "+(i+1)+"is = "+arr[i]);
		}

	}

}
