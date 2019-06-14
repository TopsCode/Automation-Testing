package fundamentals;
//Parent class
class Shape
{
	void draw()
	{
      System.out.println("This Shape-parent class draw() method");
	}
}
//child class Circle
class Circle extends Shape
{
	double radius;
	void draw()
	{
		System.out.println("This Circle-child class draw() method");
		radius=4;
		double area=3.14*radius*radius;
		System.out.println("Area of Circle:"+area);

	}
}
//child class Triangle
class Triangle extends Shape
{
	double ht,bs;
	void draw()
	{
		System.out.println("This Triangle-child class draw() method");
		ht=3;
		bs=2;
		double area=0.5*ht*bs;
		System.out.println("Area of Triangle:"+area);

	}
}



public class MethodOverridingDemo {

	public static void main(String[] args) {
               //Call Cricle draw() method
		Shape c=new Circle();
		c.draw();
               
		//Call Triangle draw() method
		Shape t=new Triangle();
		t.draw();
		
		

	}

}
