package com.dest.Exception.prbl;

import java.util.Scanner;

class overAgeException extends Exception {
	public String toString() {
		// TODO Auto-generated method stub
		return "You are already senior citizen. Please Control!!";
	}
}
class underAgeException extends Exception{
	public String toString() {
		// TODO Auto-generated method stub
		return super "You are still a kid. Please grow up soon";
	}
}
class candidate{
	int age;
	void collectData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		age = sc.nextInt();
	}
	void verify() throws Exception {
		if(age>50) {
			overAgeException oae = new overAgeException();	
		}
		else if(age<18){
			underAgeException uae = new underAgeException();
		}
		else {
			System.out.println("Hell user you are eligible for getting married");
		}
	}
}
class matrimony{
	void validate User(candidate c) {
		
	}
}
public class Launch2 {
	public static void main(String[] args) {
		candidate c1 = new candidate();
		candidate c2 = new candidate();
		candidate c3 = new candidate();
		
	}
}
