package com.dest.collectionframework.arraylist;

import java.util.HashSet;

public class hashset {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(100);
		hs.add(50);
		hs.add(150);
		hs.add(25);
		hs.add(75);
		hs.add(125);
		hs.add(175);
		System.out.println(hs);
		System.out.println(hs.size());
		hs.remove(25);
		System.out.println(hs);
		HashSet hs2 = new HashSet();
//		hs.clone(hs2);
		hs.clear();
		System.out.println(hs);
		System.out.println(hs.isEmpty());
	}
}
