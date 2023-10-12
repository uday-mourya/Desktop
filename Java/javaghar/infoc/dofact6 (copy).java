import java.util.Scanner;
class Test
{
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the number");
 int n=sc.nextInt();
 float i=1,sum=0,fact=1;
 do
 {
  fact=fact*i;
  System.out.print(i+"/"+"!"+i);
  sum=sum+(i/fact);
  if(i<n)
  System.out.print("+");
  i++;
  }
  while(i<=n);
  System.out.print("="+sum);
  }
  }
  
