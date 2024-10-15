package com.dest.array.day2;

import java.util.Scanner;

public class Program4 {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the total number of languages: ");
		int lang = sc.nextInt();
		System.out.println("Enter the total number of movie types in each languages: ");
		int mov_typ=sc.nextInt();
		System.out.println("Enter the total number of movies in each type of language: ");
		int mov=sc.nextInt();
		long overall_rev=0l;
		long arr[][][]=new long[lang][mov_typ][mov];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside the language no: "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Inside the type no: "+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("Enter The revenue made by the movie: "+(k+1));
					arr[i][j][k]=sc.nextLong();
					overall_rev=overall_rev+arr[i][j][k];
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside the language no: "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Inside the type no: "+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("The revenue made by the movie: "+(k+1)+"is="+arr[i][j][k]);
				}
			}
		}
		long profit=0l;
		long loss = 0l;
		if(overall_rev>5000000000l) {
			profit=overall_rev-5000000000l;
			System.out.println("Satish  is profit of"+profit);
		}else {
			loss=5000000000l-overall_rev;
			System.out.println("satish is loss with"+loss);
		}
		
	}

}
