import java.util.Scanner;
class Test
{ 
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter any natural number");
  int n= sc.nextInt();
  int i=1;
  double sum=0,fact=1;
  while(i<=n)
  {
   fact =fact*i;
   
   
   if(i%2==0)
   {
   sum=sum+fact/(i*2-1);
   System.out.print("!"+i+"/"+(i*2-1));
   }
   else
   {
   sum=sum-fact/(i*2-1);
   System.out.print("-"+"!"+i+"/"+(i*2-1));
   if(i<n) 
   System.out.print("+");
   }
   i++;
  }
  System.out.print("="+sum);
  
   
 }
}  

