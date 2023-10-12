import java.util.Scanner;
class Test
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Any number");
int n=sc.nextInt();
int i=2;
while(i<n)
{ 
if(n%i==0)
  break;
 i++;
 }
 if(i==n) 
  System.out.println("prime");
  else
   System.out.println("not prime");
 }
 }  
