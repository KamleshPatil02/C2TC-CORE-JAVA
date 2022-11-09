package com.cg.corejava;

import java.util.Scanner;

public class Evenorodd {

	public static void main(String[] args) 
	{

		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println(" Enter Number :");
		int a=obj.nextInt();
		
		if(a % 2==0)
		System.out.println(a+" is Even");
		else
		System.out.println(a+" is Odd ");

	}

}
