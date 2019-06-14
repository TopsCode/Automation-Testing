package BankDemo;

import java.util.Scanner;
//Custome Exception class declartion
class Insuffientfund extends Exception{
	
	double amount;
	
	public Insuffientfund(double amount) 		
		this.amount = amount;	
	}
	
	public double getAmount(){
		
		return amount;
	}

}
//class to check account balance
 class CheckingAccount {

	int acno;
	double balance = 0.0;

	public CheckingAccount(int acno) {
		this.acno = acno;
	}

	public void desposite(double amount) {

		balance = balance + amount;
	}

	public void withdraw(double amount) throws Insuffientfund  {

		if (amount <= balance) {

			balance = balance - amount;
		} else {

			double needs = amount - balance;
			throw new Insuffientfund(needs);
		}
	}

	public double getBalance() {
		return balance;

	}
}



public class BankDemo {

	public static void main(String[] args) {
		
		CheckingAccount c = new CheckingAccount(101);
		
		c.getBalance();
		
		System.out.println("Enter the amount for deposite :");
		Scanner sc = new Scanner(System.in);
		double amount = sc.nextDouble();
		
		c.desposite(amount);
		
		System.out.println("Current Balance :"+c.getBalance());
		
		
		try{
			
			System.out.println("Enter the amount for withdraw :");
			amount = sc.nextDouble();
			
			c.withdraw(amount);
			System.out.println("Current Balance :"+c.getBalance());
			
		}catch(Insuffientfund e){
			
			System.out.println("Sorry you need Another"+e.getAmount());
			c.getBalance();
			
		}

	}

}
