package fundamentals;

public class MethodOverloadingDemo {
//method for adding 2 integers
int ADD(int x,int y)
{
	return x+y;
}
//method for adding 2 double numbers
double ADD(double x,double y)
{
	return x+y;
}
	public static void main(String[] args) {
		MethodOverloadingDemo ob=new MethodOverloadingDemo();
              //calling integer ADD() method
		System.out.println("Addition of double type:"+ob.ADD(3.4, 5.6));
              //calling double ADD() method
		System.out.println("Addition of int type:"+ob.ADD(2,1));
		
	}

}
