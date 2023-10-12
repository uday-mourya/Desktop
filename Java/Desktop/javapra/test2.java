import java.util.Scanner;
class Test
{
   public static void main(String[] args)
   { 
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter Age");
        int age=sc.nextInt();
        if(age<0||age>100)
          System.out.println("INVALID AGE");
   }
}
