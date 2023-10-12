import java.util.Scanner;
class Test
{ 
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter any number");
  int n= sc.nextInt();
  int i=1;
 double sum=1,s=0,fact=1;
  while(i<=n)
  {
    sum =sum*i;
    sum=(i+1)/fact;
   System.out.print((i+1)+"/"+"!"+i);
   s=sum+s; 
   i++;
   if(i<=n)
   System.out.print("+");
  } 
  System.out.print("=" +s);
 }
}  
