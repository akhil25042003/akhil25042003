
package com.dest.array.day3;

import java.util.Scanner;

public class Program3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int copy = num;
		int sum = 0;
		int len = String.valueOf(num).length();
		
		while(num != 0) {
			int rem = num % 10;
			int mul = 1;
			for (int i = 1; i <= len; i++) {
				mul *= rem;
			}
			sum += mul;
			num /=10;
		}
		if(sum == copy) {
			System.out.println(copy + "is an armstong");
		} else {
			System.out.println(copy + "is not armstrong");
		}
			
	}
}
