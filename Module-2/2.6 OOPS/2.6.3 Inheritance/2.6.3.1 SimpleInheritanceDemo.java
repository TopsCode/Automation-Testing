package fundamentals;

import java.util.Scanner;

class Person//Super class
{
	int pid;
	String pname;
	void acceptP()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter |Person id and name:");
		pid=sc.nextInt();
		pname=sc.next();
	}
	void dispP()
	{
		System.out.println("Person ID:"+pid);
		System.out.println("Person name:"+pname);
	}
}
class Student extends Person //Student is-a Person
{
	double m1,m2,total;
	void AcceptStd()
	{
		acceptP();//Person class method access
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks of two subjects:");
		m1=sc.nextDouble();
		m2=sc.nextDouble();
	}
	double cal_total()
	{
		total=m1+m2;
		return total;
	}
	void dispStd()
	{
		dispP();//Person class method access
		System.out.println("marks-1:"+m1);
		System.out.println("marks-2:"+m2);
		System.out.println("Total of marks is:"+cal_total());
	}
}
public class SimpleInheritanceDemo {

	public static void main(String[] args) {
                //Object of derived class Student
		Student s=new Student();
		s.AcceptStd();
		s.dispStd();

	}

}
