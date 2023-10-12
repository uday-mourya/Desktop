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
 System.out.print((i+1)+"/"+"!"+i);
 sum=sum+(i+1)/fact;
 if(i<n)
 System.out.print("+");
 i++;
 }
 while(i<=n);
 System.out.print("="+sum);
 }
 }
