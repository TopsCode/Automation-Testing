package PraticeProgram;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int x[];
		System.out.println("please enter the size of array :");
		int size=sc.nextInt();
		x=new int[size];
		for (int j = 0; j < x.length; j++) {
			System.out.println("please enter value at " + j);
			x[j] = sc.nextInt();
		}
        for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
        
        System.out.println("enter new size : ");
        int nsize=sc.nextInt();
        int temp[]=x;
        x=new int[nsize];
	    for(int k=0;k<temp.length;k++){
	    	x[k]=temp[k];
	    }  
	    for(int i=temp.length;i<x.length;i++){
	    	System.out.println("enter value at "+i);
	    	x[i]=sc.nextInt();
	    }
	    System.out.println("final array ::");
	    for(int j=0;j<x.length;j++){
	    	System.out.println(x[j]); 	
	    }

	}

}
