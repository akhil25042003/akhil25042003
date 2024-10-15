package com.dest.String.prblm;
class heart{
	int beat;
	float size;
	public heart(int beat, float size) {
		super();
		this.beat = beat;
		this.size = size;
	}
	public int getBeat() {
		return beat;
	}
	public float getSize() {
		return size;
	}
}
class brain{
	int iq;
	float size;
	public int getIq() {
		return iq;
	}
	public float getSize() {
		return size;
	}
	public brain(int iq, float size) {
		super();
		this.iq = iq;
		this.size = size;
	}
}
class bike{
	int cost;
	float speed;
	public int getCost() {
		return cost;
	}
	public float getSpeed() {
		return speed;
	}
	public bike(int cost, float speed) {
		super();
		this.cost = cost;
		this.speed = speed;
	}
}
class book{
	String author;
	int cost;
	public String getAuthor() {
		return author;
	}
	public int getCost() {
		return cost;
	}
	public book(String author, int cost) {
		super();
		this.author = author;
		this.cost = cost;
	}
}
class human{
	heart h = new heart(72,9.2f);
	brain b = new brain(999,3.6f);
	void hasbike(bike bi) {
		System.out.println(bi.getCost());
		System.out.println(bi.getSpeed());
	}
	void hashuman(book bo) {
		System.out.println(bo.getAuthor());
		System.out.println(bo.getCost());
	}
}


public class Launch22 {
	public static void main(String[] args) {
		human hu = new human();
		bike bi = new bike(1000, 250);
		book bo = new book("jhon", 99);
		System.out.println(hu.h.getBeat());
		System.out.println(hu.h.getSize());
		System.out.println(hu.b.getIq());
		System.out.println(hu.b.getSize());
		hu.hasbike(bi);
		
		
	}

}
