import java.util.Scanner;
class Test
{ 
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter any natural number");
  int n= sc.nextInt();
  int i=1;
  int fact=1,sum=0;
  while(i<=n)
  {
   fact=fact*i;
   
   System.out.print("!"+i);
   
   if(i%2==0)
   {
   sum=sum-fact;
   System.out.print("+");
   }
   else
   {
   sum=sum+fact;
   if(i<n)
    System.out.print("-");
    
    }
    i++;
  } 
  System.out.print("="+sum);
 }
}  
