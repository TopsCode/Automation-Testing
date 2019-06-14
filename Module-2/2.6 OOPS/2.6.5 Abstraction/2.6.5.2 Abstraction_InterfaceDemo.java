package com.fundamentals;
//Interface declaration
interface RBI
{
        //abstract method
	void RateOfInterset();
	void msg();

        //default method
	default void defmethod()
	{
		System.out.println("This is default method.");
	}

        //static method
	static void statmethod()
	{
		System.out.println("Static method");
	}
}
interface Cost_details
{
	void showdetails();
	void msg();
}
//Extending one interface into another
interface AllData extends RBI,Cost_details
{
	void showallData();
}

//Implementing Interface into Class
class Sample_new implements AllData
{

	@Override
	public void RateOfInterset() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void msg() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showdetails() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showallData() {
		// TODO Auto-generated method stub
		
	}
	
}
class SBI implements RBI,Cost_details//multipal inheritance by means of interface
{

	@Override
	public void RateOfInterset() {
		System.out.println("Rate of intrest:%10");
		
	}

	@Override
	public void showdetails() {
		System.out.println("cost id:11");
		System.out.println("cost name:Nivedita");
	}

	@Override
	public void msg() {
		System.out.println("This is interface");
		
	}
}
public class Abstraction_InterfaceDemo {

	public static void main(String[] args) {
		RBI ref=new SBI();//Interface reference initialization 
		ref.RateOfInterset();//SBI
		ref.defmethod();//default method
		RBI.statmethod();
		
		Cost_details cref=new SBI();
		cref.showdetails();
		
		SBI obj=new SBI();
		obj.msg();
		obj.defmethod();		
	}

}
