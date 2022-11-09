package com.cg.corejava.Day6;

public class StringHandling 
{

	public static void main(String[] args)
	{
		//String s =new String("Avantika");
		//	s.concat(s); //String Objects are immatable ------cannot be changed
			//System.out.println(s);
			
			//StringBuffer s=new StringBuffer("Avantika");
				//	s.append("Bisht");//StringBuffer objects are mutable in nature
							//System.out.println(s);
			
		//que how many object create ANS= 3 object create	
			//String s1=new String("hello");
			//String s2=new String("hello");
			//String s3="hello";
			//String s4="hello";
			
			//method in java 
			
//			String s="Avantika";
//			System.out.println(s.toLowerCase());
//			System.out.println(s.toUpperCase());
//			
//			System.out.println(s.equals("avantika"));
//			System.out.println(s.equalsIgnoreCase("AVANTIKA"));
			
//			System.out.println(s.replace('A','P'));
			
//			System.out.println(s.substring(2));//antika
			
//			System.out.println(s.substring(2,6)); //anti beginning --->included end index--->excluded
		
	//string handleling		
			String a="Ananya";
			int b=10, c=20, d=30;
				System.out.println(a+b+c+d);
				System.out.println(b+c+d+a);
				System.out.println(b+c+a+d);
				System.out.println(b+a+c+d);

		}

	

}
