package com.cg.corejava;

class DailyPractice 
{
    public static void main(String[] args) 
    {
        try
        {
            int a =args.length;
            int b=10/a;
             System.out.println(a);
             try
             {
                 if(a==1)
                    a=a/a-a;
                 if(a==2)
                    {
                        int []c={1};
                        c[8]=9;
                    }
             }
            catch(ArrayIndexOutOfBoundException e)
            {
                System.out.println("TypeA");
            }
            catch(ArithmeticException e)
            {
                System.out.println("TypeA");
            }
        }
        
    }
}

