import java.util.Scanner;
class Test
{ 
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter any natural number");
  int n= sc.nextInt();
  int i=0;
  int sum=1,a=0;
  while(i<n)
  {
   sum=sum+i;
   System.out.print(sum);
   a= a+sum;
   i++;
   if(i<n)
   System.out.print("+");
  } 
  System.out.print("="+a);
 }
}  
