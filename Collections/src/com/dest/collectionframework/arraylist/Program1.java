package com.dest.collectionframework.arraylist;

import java.util.LinkedList;

public class Program1 {
	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.add(100);
		l1.add(50);
		l1.add(150);
		l1.add("g");
		l1.add("hi");
		System.out.println(l1);
		l1.add(true);
		l1.add(25.654654);
		l1.add(22.46f);
		LinkedList l2 = new LinkedList();
		l2.addAll(l1);
		System.out.println(l2);
		l2.push(50);
		System.out.println(l2);
		l2.pop();
		System.out.println(l2);
		
	}
}
