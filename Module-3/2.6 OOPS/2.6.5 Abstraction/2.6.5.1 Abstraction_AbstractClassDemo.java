package com.fundamentals;

abstract class Shape_n//Parent classs
{
	abstract void area();//abstract method
	void display_msg()//non abstract method
	{
		System.out.println("I am Parent Shape.");
	}
	
}
class Cricle_n extends Shape_n
{
	double radius;
	public Cricle_n() {
		radius=2.0;
	}
	@Override
	void area() {
		// TODO Auto-generated method stub
		
	}
	
}
class Rectangle_n extends Shape_n
{
	double len,brd;
	public Rectangle_n() {
		len=2;
		brd=3;
	}
	void area()
	{
		System.out.println("area() method of Rectangle");
		double a=len*brd;
		System.out.println("Area of Rectangle:"+a);
	}
}

public class Abstraction_AbstractClassDemo {

	public static void main(String[] args) {
		
		Shape_n c=new Cricle_n();
		c.area();
		c.display_msg();
		
		Shape_n r=new Rectangle_n();
		r.area();

		}

}
