//shadow problem 
package com.dest.object.learn;

import java.util.Scanner;

class Dog{
	private String name;
	private String Color;
	private int cost;
	private int age;
	private String Breed;
	public void setData(String name, String Color,int cost,int  age, String Breed) {
		this.name=name;
		this.Color=Color;
		this.cost=cost;
		this.age=age;
		this.Breed=Breed;
	}
	void getData(){
		System.out.println(name);
		System.out.println(Color);
		System.out.println(cost);
		System.out.println(age);
		System.out.println(Breed);
	}

}
public class thisk {
	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.getData();
		System.out.println("------");
		Scanner sc = new Scanner(System.in);
		System.out.println("Name: ");
		String name = sc.next();
		System.out.println("Color: ");
		String Color = sc.next();
		System.out.println("Cost:  ");
		int cost = sc.nextInt();
		System.out.println("Age: ");
		int age = sc.nextInt();
		System.out.println("Breed: ");
		String Breed = sc.next();
		d1.setData();
		d1.getData();
	}

}
