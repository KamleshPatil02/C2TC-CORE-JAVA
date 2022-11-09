package com.cg.corejava.Day3;

public class ParameterConstructor 
{


			String name;
			int rollNo;

			//Parameterized Constructor
			public ParameterConstructor(String name, int rollNo) 
				{
					super();
					this.name = name;
					this.rollNo = rollNo;
				}


				public static void main(String[] args) 
				{
					ParameterConstructor a1= new ParameterConstructor("Kamlesh",01);
							System.out.println(a1.name+" "+a1.rollNo);
					ParameterConstructor a2= new ParameterConstructor("HETVIK",02);
							System.out.println(a2.name+" "+a2.rollNo);
				}
				

}


