package PraticeProgram;

class A1 {

	A1() {

		System.out.println("Default Constructor of A: ");
	}

	void show() {

		System.out.println("Class A show method called");
	}

}

class B1 extends A1 {

	B1() {

		System.out.println("Default Contructor of B: ");
	}

	void show() {

		super.show();
		System.out.println("Class B show method called");
	}
}

class C1 extends B1 {

	C1() {
		System.out.println("Default Contructor of C");
	}

	void show() {

		super.show();
		System.out.println("Class C show method called");
	}
}

public class conschaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C1 c = new C1();
		//2c.show();

	}

}
