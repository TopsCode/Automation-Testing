package com.fundamentals;

import java.util.Scanner;

public class Array_Demo {

	public static void main(String[] args) {
        //one-D array declaration
	int a[]=new int[5];//dynamically created on heap segment

        //two-D array declartion
     	int b[][]=new int[2][2];
	
	int c[]= {10,20,30,40};//1d array initialization
	int d[][]= {{10,20},{3,4}};//2d array initialization
	
	
	System.out.println("Array c elemnts are:");
	for(int i=0;i<c.length;i++)
	{
		System.out.println("c["+i+"]:"+c[i]);
	}
	
	System.out.println("Array d matrix elemnts are:");
	for(int i=0;i<d.length;i++)
	{
		for(int j=0;j<d.length;j++)
		{
			System.out.print(d[i][j]+"   ");
		}
		System.out.println();
	}
	/*
	//1 d array implementation
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<a.length;i++)
	{
	    System.out.println("Enter elemnt "+(i+1));
	    a[i]=sc.nextInt();
	}
	System.out.println("Array a elemnts are:");
	for(int i=0;i<a.length;i++)
	{
		System.out.println("a["+i+"]:"+a[i]);
	}

	//2d array implementation
	for(int i=0;i<b.length;i++)
	{
		for(int j=0;j<b.length;j++)
		{
	    System.out.println("Enter elemnt ");
	    b[i][j]=sc.nextInt();
		}
	}
	System.out.println("Array b matrix elemnts are:");
	for(int i=0;i<b.length;i++)
	{
		for(int j=0;j<b.length;j++)
		{
			System.out.print(b[i][j]+"   ");
		}
		System.out.println();
	}
	*/
	//copyTo() method demo
	char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e',
	'd' };
	char[] copyTo = new char[7];
	System.arraycopy(copyFrom, 2, copyTo, 0, 7);
	System.out.println(new String(copyTo));
	}

}
