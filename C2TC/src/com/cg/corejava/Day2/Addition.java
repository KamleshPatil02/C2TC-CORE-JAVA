package com.cg.corejava.Day2;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) 
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Please Enter First Number :");
		int num1=obj.nextInt();
		
		System.out.println("Please Enter Second Number :");
		int num2=obj.nextInt();
		
		int result=num1+num2;
		System.out.println("Addition Of Two Number Is : "+result);

	}

}
