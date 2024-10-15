package com.dest.String.prblm;
abstract class Shapes{
	double area;
	abstract void collect();
	abstract void calculate();
	void display() {
		System.out.println("Dispaly ");
	}
}
class Circle extends Shapes{
	private double r ;
	private final double pi = 3.1476;
	@Override 
	void collect() {
		System.out.println("Collecting the information ");
	}
	@Override
	void calculate() {
		System.out.println("Calculating area of Circle");
	}
	void dispaly() {
		System.out.println("Diplay area of circle "+pi*r*r);
	}
	
}
class Square extends Shapes{
	double side;
	@Override
	void collect() {
		System.out.println("Collecting side value : ");
	}

	@Override
	void calculate() {
		System.out.println("Calculating area of square");
	}
	void dispaly() {
		System.out.println("Area of Square : "+ s*s );
	}
}
class Rectangle extends Shapes{
	double l,b;
	@Override
	void collect() {
		System.out.println("Collect the values of l , b ");
	}

	@Override
	void calculate() {
		System.out.println("Calculate the area of the Rectangle");
	}
	void display() {
		System.out.println("Area of Rectangle : "+ l*b );
	}
}
class Geometry{
	void useShapes(Shapes s) {
		s.collect();
		s.calculate();
		s.display();
	}

	void collect() {
		// TODO Auto-generated method stub
		
	}

	void Calculate() {
		// TODO Auto-generated method stub
		
	}
}
public class Launch1 {
	public static void main(String[] args) {
		Circle C = new Circle();
		Square s = new Square();
		Rectangle r = new Rectangle();
		Shapes s1 = new Shapes() {
			@Override 
			void collect() {
			}
			@Override
			void calculate() {
			}
		};
		Geometry G  = new Geometry();
		System.out.println(s1);
		System.out.println("Circle");
		G.permit(C);
		
	}

}
