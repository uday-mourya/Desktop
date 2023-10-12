import java.util.Scanner;
class Test
{ 
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter any natural number");
  int n= sc.nextInt();
  int i=1;
  int sum=1,a=0;
  while(i<=n)
  {
   sum =sum*i;
   
   
   
   if(i%2==0)
   {
   System.out.print("+!"+i);
   a=a+sum;
   
   }
   else
   { 
   System.out.print("-!"+i);
   a=a-sum;
   
  
    
    }
    i++;
  } 
  System.out.print("="+a);
 }
}  
