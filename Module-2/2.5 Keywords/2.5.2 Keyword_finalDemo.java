package fundamentals;
final class MyFinal
{
	final int a;//blank final variable
	static final int b;//static final variable

        //changing value of blank final variable
	public MyFinal() {
		a=10;
	}
        //changing blank static final variable using static block
	static
	{
		b=109;
	}
	final void Display()
	{
		System.out.println("Parent display()");
	}
}
class ChildFinal extends MyFinal
{
	void Display()
	{
		System.out.println("child display()");
	}
}
public class Keyword_finalDemo {

	public static void main(String[] args) {
	MyFinal m=new MyFinal();
	System.out.println("a:"+m.a);
	System.out.println("b:"+m.b);

	}

}
