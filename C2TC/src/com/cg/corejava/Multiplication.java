package com.cg.corejava;

import java.util.Scanner;

public class Multiplication 
{

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Please Enter First Number :");
		int a=obj.nextInt();
		
		System.out.println("Please Enter Second Number :");
		int b=obj.nextInt();
		
		int result=a*b;
		System.out.println("Multiplication Of Two Number Is : "+result);
	}

}
