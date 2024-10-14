package com.dest.project.p1;

import java.util.Scanner;

class Quiz1{
	
}

public class Project1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String answer ="";
		int score = 0; 
		System.out.println("Question -1 ");
		System.out.println("How many loops are there in java");
		System.out.println("4");
		System.out.println("2");
		System.out.println("3");
		System.out.println("5");
		answer = sc.next();
		if(answer.equals("4")) {
			System.out.println("Correct");
			score++;
		}else {
			System.out.println("Wrong");
		}
		System.out.println("Question -2 ");
		System.out.println("How many types of variables");
		System.out.println("4");
		System.out.println("2");
		System.out.println("3");
		System.out.println("5");
		answer = sc.next();
		if(answer.equals("3")) {
			System.out.println("Correct");
			score++;
		}else {
			System.out.println("Wrong");
		}
		System.out.println("Question -3 ");
		System.out.println("How many types of memories in RAM ");
		System.out.println("4");
		System.out.println("2");
		System.out.println("3");
		System.out.println("5");
		answer = sc.next();
		if(answer.equals("4")) {
			System.out.println("Correct");
			score++;
		}else {
			System.out.println("Wrong");
		}
		System.out.println("Question -4 ");
		System.out.println("In how many ways Strings are classified ");
		System.out.println("3");
		System.out.println("2");
		System.out.println("1");
		System.out.println("0");
		answer = sc.next();
		if(answer.equals("2")) {
			System.out.println("Correct");
			score++;
		}else {
			System.out.println("Wrong");
		}System.out.println("Question -5 ");
		System.out.println("what is return type of str.length");
		System.out.println("int");
		System.out.println("No return type");
		System.out.println("String");
		System.out.println(" boolean");
		answer = sc.next();
		if(answer.equals("int")) {
			System.out.println("Correct");
			score++;
		}else {
			System.out.println("Wrong");
		}System.out.println("Question - 6");
		System.out.println("How many parameters in str.toLowerCase");
		System.out.println("0");
		System.out.println("1");
		System.out.println("2");
		System.out.println("infinty");
		answer = sc.next();
		if(answer.equals("0")) {
			System.out.println("Correct");
			score++;
		}else {
			System.out.println("Wrong");
		}
		System.out.println("Question - 7 ");
		System.out.println(" Mutable Strings can be change once created ");
		System.out.println("yes");
		System.out.println("NO");
		System.out.println("Error");
		System.out.println("All of the above");
		answer = sc.next();
		if(answer.equals("yes")) {
			System.out.println("Correct");
			score++;
		}else {
			System.out.println("Wrong");
		}
		System.out.println("Question - 8 ");
		System.out.println("What are the important segment in java");
		System.out.println("Static blocks");
		System.out.println("Static variables");
		System.out.println("Static methods");
		System.out.println("All of the above");
		answer = sc.next();
		if(answer.equals("All of the above")) {
			System.out.println("Correct");
			score++;
		}else {
			System.out.println("Wrong");
		}
		System.out.println("Question - 9 ");
		System.out.println("How many important pillars in OOPS");
		System.out.println("4");
		System.out.println("2");
		System.out.println("3");
		System.out.println("5");
		answer = sc.next();
		if(answer.equals("4")) {
			System.out.println("Correct");
			score++;
		}else {
			System.out.println("Wrong");
		}
		System.out.println("Question -10 ");
		System.out.println("A class  in java which doesn't have any parent class ");
		System.out.println("orphan");
		System.out.println("Object");
		System.out.println("parent");
		System.out.println("No class ");
		answer = sc.next();
		if(answer.equals("4")) {
			System.out.println("Correct");
			score++;
		}else {
			System.out.println("Wrong");
		}
		System.out.println(score);
	}

}
