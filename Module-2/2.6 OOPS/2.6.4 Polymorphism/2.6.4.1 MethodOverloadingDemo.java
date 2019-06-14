package fundamentals;

public class MethodOverloadingDemo {
int ADD(int x,int y)
{
	return x+y;
}
double ADD(double x,double y)
{
	return x+y;
}
	public static void main(String[] args) {
		MethodOverloadingDemo ob=new MethodOverloadingDemo();
		System.out.println("Addition of double type:"+ob.ADD(3.4, 5.6));
		System.out.println("Addition of int type:"+ob.ADD(2,1));
		
	}

}
