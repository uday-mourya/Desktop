import java.util.Scanner;
interface Inf1
{
  public abstract void calculate(int a,int b);
  //void show();
}
class Calculator 
{
    
         Inf1 ref =new Inf1()
         {
          public int Calculate(int a,int b)
          {
             return a+b;
          }
         };
         Inf1 ref2=new Inf1()
         { 
           public int Calculate(int a,int b)
           {
             return a-b;
           }
         };
           System.out.println(ref1.Calculate(10,10));
           System.out.println(ref2.Calculate(20,20));
      
}
class Test
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        Calculator ob=new Calculator();
        do
        {
           System.out.println("# PRESS 1 FOR ADDITION ");
           System.out.println("# PRESS 2 FOR SUBSTRACTION ");
           int ch=sc.nextInt();
           switch(ch)
           { 
             case 1:
             System.out.println("Enter TWO Number");
             int a=sc.nextInt();
             int ab=sc.nextInt();
        
           }
        }while(ch!=10)
    }
}
