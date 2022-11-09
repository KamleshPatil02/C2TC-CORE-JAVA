package com.cg.corejava;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) 
	{
		int [] arr= {20,59,96,7,5862,74,96,35,19,85};
		
		Arrays.sort(arr);
		for(int i:arr)
		{
			System.out.println(i+ "");
		}
		//find length of array
		System.out.println("Length Of Array Is = "+arr.length);

	}

}
