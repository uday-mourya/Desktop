import java.util.Scanner;
class Test
{ 
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter any natural number");
  int n= sc.nextInt();
  int i=1;
  int sum=0;
  while(i<=n)
  { 
    System.out.print(i);
   if(i<n)
   System.out.print("+");
   sum=sum+i;
   i++;  
  } 
  System.out.print("="+sum);
 }
}  
