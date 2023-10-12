import java.util.Scanner;
class Test
{   
    public int show()
    { 
      Scanner sc=new Scanner(System.in);
      System.out.println(" Enter Any Number ");
      int n=sc.nextInt(); 
      int fact=1;
      int i=1;
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
     int fact=ob.show();
     System.out.println("Factorial = "+fact);
     //System.out.println("Factorial = "+new Test().show());
     System.out.println("Main Method End");
   }
}
   
