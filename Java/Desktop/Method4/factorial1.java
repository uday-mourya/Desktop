import java.util.Scanner;
class Test
{   
    public int input()
    { 
      Scanner sc=new Scanner(System.in);
      System.out.println(" Enter Any Number ");
      int n=sc.nextInt(); 
      int fact=1;
      int i=1;
      int res=this.fact(n,fact,i);
      System.out.println("Factorial = "+res);
      return res;
    }  
   public int fact(int n,int fact,int i)
   {
   
    while(i<=n)
      {
         fact=fact*i;
         i++;
      }
      return fact;
   
   }
   public static void main(String [] args)
   {
     System.out.println("Welcome in main Method");
     Test ob =new Test();
     int fact=ob.input();
     System.out.println("Main Method End");
   }
}
   
