package com.cg.corejava.Day9;

public class StaticBlockDemo 
{

	public static void main(String[] args) 
	{
		System.out.println(" i am main");

	}
	static void m()
	{
		System.out.println(" i am static method");
	}
	static 
	{
		System.out.println(" good mornning");
		m();
	}
	static 
	{
		System.out.println(" good evening");
	}
}
