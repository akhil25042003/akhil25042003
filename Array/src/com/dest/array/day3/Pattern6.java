package com.dest.array.day3;
import java.util.Scanner;
public class Pattern6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count of University: ");
		int uni = sc.nextInt();
		int arr[][][][]= new int[uni][][][];
		for (int i=0;i<arr.length;i++) {
			System.out.println("Enter the college count in university: "+(i+1));
			arr[i]=new int[sc.nextInt()][][];
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside the University no : "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Inside the college no: "+(j+1));
				System.out.println("Enter the class count: ");
				arr[i][j]=new int[sc.nextInt()][];
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside the University no : "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Inside the college no: "+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("Inside the University : "+(i+1));
					System.out.println("Inside the college no: "+(j+1));
					System.out.println("Inside the class no: "+(k+1));
					System.out.println("Enter the Student count: ");
					arr[i][j][k]=new int[sc.nextInt()];
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside the University No :"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Inside the college No: "+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("Inside the class No: "+(k+1));
					for(int l=0;l<arr[i][j][k].length;l++) {
						System.out.println("Enter the no of student"+(l+1)+":");
						arr[i][j][k][l]=sc.nextInt();
					}
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside the University No :"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Inside the college No: "+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("Inside the class No: "+(k+1));
					for(int l=0;l<arr[i][j][k].length;l++) {
						System.out.println("The no of student"+(l+1)+"is = "+arr[i][j][k][l]);
					}
				}
			}
		}
		
	}

}
