package fundamentals;

import java.util.Scanner;

class EmployeeData
{
	int eid;
	String ename;
	double salary;
	//default constructor
	public EmployeeData() {
		System.out.println("\n It is default const");
	}
	//parameterized constructor
	//Constructor Overloading
	public EmployeeData(int id,String nm,double sal) {
		System.out.println("\n It is parameterized const");
		eid=id;
		ename=nm;
		salary=sal;
	}
	public EmployeeData(int id,String nm) {
		System.out.println("\n It is parameterized const");
		eid=id;
		ename=nm;
	}
	//copy constructor
	public EmployeeData(EmployeeData e2) {
		eid=e2.eid;//e4.eid=e2.eid
		ename=e2.ename;
		salary=e2.salary;
		
	}
	void acceptEmpData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Emp Id,name and salary:");
		eid=sc.nextInt();
		ename=sc.next();
		salary=sc.nextDouble();
	}
	void dispData()
	{
		System.out.println(" Emp Id:"+eid);
		System.out.println(" Emp Name:"+ename);
		System.out.println(" Emp Salary:"+salary);
	}
}
public class ConstructorDemo {

	public static void main(String[] args) {
      //deafult constructor call
		EmployeeData e1=new EmployeeData();	
		e1.dispData();
	
        //parameterized constructor call
		EmployeeData e2=new EmployeeData(11,"Nivedita",6000.67);
		e2.dispData();
		e2.acceptEmpData();
		e2.dispData();
		
		EmployeeData e3=new EmployeeData(11,"Nivedita");
		e3.dispData();	

	//copy constructor call
		EmployeeData e4=new EmployeeData(e2);
		System.out.println("Source object e2 values are:");
		e2.dispData();
		System.out.println("Destination object e4 values are:");
		e4.dispData();

	}

}
