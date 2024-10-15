package com.dest.collectionframework.arraylist;

import java.util.ArrayList;

class crickter{
	String name;
	String country;
	int runs;
	int matches;
	int wickets;
	int catches;
	@Override
	public String toString() {
	return name +"----"+country +"-------"+runs+"-----"+matches+"-----"+wickets+"-----"+catches;
	}
public crickter(String name, String country, int runs, int matches, int wickets, int catches) {
		super();
		this.name = name;
		this.country = country;
		this.runs = runs;
		this.matches = matches;
		this.wickets = wickets;
		this.catches = catches;
	}
public static class Launch {
	public static void main(String[] args) {
		crickter c1 = new crickter("sachin","india",2000,200,100,50);
		crickter c2 = new crickter("Lara","WI",1200,150,20,300);
		crickter c3 = new crickter("ABD","SA",8000,140,30,300);
		ArrayList<crickter> al = new ArrayList<crickter>();
		al.add(c1);
		al.add(c2);
		al.add(c3);
		System.out.println(al);
//		Collections.sort(al);
//		System.out.println(al);
	}
}

}
