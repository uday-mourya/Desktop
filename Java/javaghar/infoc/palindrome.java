import java.util.Scanner;
class Test
{
 public static void main(String args [])
 {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter any number");
 int n=sc.nextInt();
 int rev=0,sum=n;
 while(n>0)
 { 
     int r=n%10;
     n= n/10;
     rev=(r*r*r)+rev
    }
    if(rev==sum)
    System.out.println("number is aarmstromg");
    else
    System.out.println("number is not aarmstrong");
 }
 }     
