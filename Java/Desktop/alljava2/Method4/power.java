import java.util.Scanner;
class Test
{
   public int pow()
   { 
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter Number ");
     int x=sc.nextInt();
     System.out.println("Enter Power");
     int y=sc.nextInt();
     int i=1;
     int pow=1;
     for(i=1;i<=y;i++)
     {
       pow=pow*x;
       
     }
     return pow;
   }
   public static void main(String [] args)
   {
    Test ob=new Test();
    int pow=ob.pow();
    System.out.println("Power = "+pow);
   
   }
}  
