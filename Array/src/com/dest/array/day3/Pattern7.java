package com.dest.array.day3;

import java.util.Scanner;

public class Pattern7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no: ");
		int num = sc.nextInt();
		int count = 0;
		int arr[] = new int[num];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the no: "+(i+1));
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println("The no: "+(i+1)+"is = "+arr[i]);
		}
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				count = arr[i]+i;
				System.out.println(count);
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(i%2==1) {
				System.out.println(arr[i]);
			}
		}
	}
}
