import java.util.Scanner;
class Test
{ 
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter any natural number");
  int n= sc.nextInt();
  int i=1;
  int sum=1,a=1,s=0;
  while(i<=n)
  {
   sum =sum*i;
   s=a/i;
   System.out.print("!"+i+"/"+i);
   
   if(i%2==0)
   {
   a=a-sum;
   
   System.out.print("+");
   }
   else
   {
   a=a+sum;
   if(i<n)
    System.out.print("-");
    
    }
    
    i++;
  } 
  System.out.print("="+s);
 }
}  
