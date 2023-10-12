import java.util.*;
class Test
{
public static void main(String args[])
 {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter any Number");
 int n=sc.nextInt();
 int i=1;
 double sum=0,fact=1;
 do
 {
 fact=fact*i;
 if(i%2==0)
 {
 System.out.print("!"+i+"/"+(2*i)+"+");
 sum=sum-fact/(2*i);
 }
 else
 {
 System.out.print("!"+i+"/"+(2*i));
 if(i<n)
 System.out.print("-");
 sum=sum+fact/(2*i);
 }
 i++;
 }
 while(i<=n);
 System.out.print("="+sum);
 }
 }
 
