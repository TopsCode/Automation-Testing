package fundamentals;

import java.util.Scanner;

class Employee
{
	int id;
	String name;
	double salary;
	void acceptEmpData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Emp Id,name and salary:");
		id=sc.nextInt();
		name=sc.next();
		salary=sc.nextDouble();
	}
	void dispEmpData()
	{
		System.out.println("Emp Id:"+id);
		System.out.println("Emp Name:"+name);
		System.out.println("Emp Salary:"+salary);
	}
}

class Student
{
	int rollno;
	String name;
	double per;
	void acceptStdData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student rollno,name and per:");
		rollno=sc.nextInt();
		name=sc.next();
		per=sc.nextDouble();
	}
	void dispStdData()
	{
		System.out.println("Student Rollno:"+rollno);
		System.out.println("Student Name:"+name);
		System.out.println("Student Percentage:"+per);
	}
}
public class Class_ObjectDemo {

	public static void main(String[] args) {
	Employee e1=new Employee();
	e1.id=11;
	e1.name="Nivedita";
	e1.salary=5690.78;
	
	System.out.println("\n Emp details e1:");
	e1.dispEmpData();
	
	System.out.println("\n Emp details e2:");
	Employee e2=new Employee();
	e2.acceptEmpData();
	e2.dispEmpData();
	
	System.out.println("\n Student details s1:");
	Student s1=new Student();
	s1.acceptStdData();
	s1.dispStdData();
	
	
	}

}
