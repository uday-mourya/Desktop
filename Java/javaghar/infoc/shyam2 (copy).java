import java.util.Scanner;
class Test
{ 
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter any natural number");
  int n= sc.nextInt();
  int i=1;
  int sum=0,fact=1;
  while(i<=n)
  {
   fact =fact*i;
   
   
   if(i%2==0)
   {
   sum=sum+(fact/i);
   System.out.print("+!"+i+"/"+i);
   }
   else
   {
   sum=sum-(fact/i);
   System.out.print("-!"+i+"/"+i);

   }
   i++;
  }
  System.out.print("="+sum);
  
   
 }
}  
