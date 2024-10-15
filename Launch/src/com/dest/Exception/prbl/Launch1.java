package com.dest.Exception.prbl;
import java.util.*;
class opertions1{
	void ops1() throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num -1 :");
		int num1 = sc.nextInt();
		System.out.println("Enter the num - 2");
		int num2 = sc.nextInt();
		int res = num1/num2;
		System.out.println("The result is :"+res);
		System.out.println("Division is cmplt");
		System.out.println("Array operation is cmplt");
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the position number : ");
		int pos = sc.nextInt();
		System.out.println("Enter the value to be inserted");
		int val = sc.nextInt();
		arr[pos]= val;
		System.out.println("Array is added");
		System.out.println("Array operation is cmplt");
		sc=null;
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
}
class Operator2{
	void ops2() throws Exception{
		operations1 op1 = new operations1();
				op1.ops1();
	}
}
public class Launch1 {

}
