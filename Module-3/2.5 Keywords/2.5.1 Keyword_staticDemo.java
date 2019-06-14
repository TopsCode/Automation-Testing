package fundamentals;
class CollegeMag
{
	 int rollno;
	 String name;
	 static String coll_nm;//static variable declaration
	 void disp_data()
	 {
		 System.out.println("Rollno:"+rollno);
		 System.out.println("Name:"+name);
		 System.out.println("College name:"+coll_nm);
	 }
       //Static method declartion
	static void alter_coll_name()
	 {
		 coll_nm="KS College,Surat";
	 }
       //static block declaration
	static
	{
		System.out.println("this is static-sample block");
	}
}
public class Keyword_staticDemo {
	static
	{
		System.out.println("this is static block");
	}
	public static void main(String[] args) {
		
	System.out.println("this is main() block");	
	CollegeMag.coll_nm="LD College,Ahmedabad";	
	
    CollegeMag s1=new CollegeMag();
    s1.rollno=11;
    s1.name="Nivedita";
    s1.disp_data();
    
    CollegeMag.alter_coll_name();//calling static method 
    
    CollegeMag s2=new CollegeMag();
    s2.rollno=22;
    s2.name="Smit";
    s2.disp_data();
	}

}
