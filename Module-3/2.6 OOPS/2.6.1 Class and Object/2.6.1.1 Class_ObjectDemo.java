package fundamentals;

import java.util.Scanner;

//Declaration of class
class Employee
{
     //Attributes of class
	int id;
	String name;
	double salary;
	void acceptEmpData()//method
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
	
	}

}
