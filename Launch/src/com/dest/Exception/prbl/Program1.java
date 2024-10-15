package com.dest.Exception.prbl;

import java.util.Scanner;

class Operations implements Runnable{
	//@Override
	public void run() {
		if(Thread.currentThread().getThreadGroup().getName.equals("banking")) {
			banking();
		}
		else if(Thread.currentThread().getThreadGroup().getName.equals("printing")){
			printing();
		}
		else {
			multiplication();
		}
}
public void banking() {
	Scanner sc = new Scanner(System.in);
	System.out.println("----Banking operation started------");
	System.out.println("Enter the accno: ");
	int accno= sc.nextInt();
	System.out.println("Enter the pin: ");
	int pin = sc.nextInt();
	System.out.println("-----Banking operation is completed0----------");
}
public void printing() {
	Scanner sc = new Scanner(System.in);
	System.out.println("-----Printing is started-------");
	try {
		for(int i = 0;i<5;i++) {
			System.out.println("hello good evening ");
			Thread.sleep(2000);
		}
		System.out.println("--printing is completed------");
	catch(Exception e) {
		e.printStackTrace();
	}
}
public void multiplication() {
	Scanner sc = new Scanner(System.in);
	System.out.println("---Multiplication is started ------");
	System.out.println("Enter the num1: ");
	int num1 = sc.nextInt();
	System.out.println("Enter the num2: ");
	int num2 = sc.nextInt();
	int res = num1* num2;
	System.out.println(res);
	System.out.println("Multiplication is ended----");
}
}
public class Program1 {
	public static void main(String[]args) throws InterruptedException{
		Operations op1 = new Operations();
		Operations op2 = new Operations();
		Operations op3 = new Operations();
		Thread t1 = new Thread(op1);
		Thread t2 = new Thread(op2);
		Thread t3 = new Thread(op3);
		t1.setName("banking");
		t2.setName("printing");
		t3.setName("multiplication");
		
		t1.start();
		t2.start();
		t3.start();
}
}
