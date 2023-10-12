import java.util.Scanner;
class Test
{ 
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter any number");
  int n= sc.nextInt();
  int i=1;
 double a=1,s=0,sum=1;
  while(i<=n)
  {
    sum =sum*i;
    a=(i*2-1)/sum;
   System.out.print((i*2-1)+"/"+"!"+i);
   s=a+s; 
   i++;
   if(i<=n)
   System.out.print("+");
  } 
  System.out.print("=" +s);
 }
}  
