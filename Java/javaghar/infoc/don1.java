import java.util.Scanner;
class Test
{
 public static void main(String Args [])
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter any number");
   int n=sc.nextInt();
   int i=1,sum=0;
   do
   { 
     
     sum=sum+i;
     System.out.print(i);
     if(i<n)
     System.out.print("+");
     i++;
    }
    while(i<=n);
    System.out.println("="+sum);
    }
    }
     
