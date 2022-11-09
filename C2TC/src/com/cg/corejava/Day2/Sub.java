package com.cg.corejava.Day2;

import java.util.Scanner;

public class Sub 
{

	public static void main(String[] args)
	{
		Scanner obj= new Scanner(System.in);

		System.out.println("Please enter first Number-->"); 
		
		int num1=obj.nextInt();

		System.out.println("Please enter second Number-->"); 
		
		int num2=obj.nextInt();

		int sub=num1-num2; System.out.println("Sub of two Numbers-->"+sub);


	}

}
