import java.util.Scanner;
class Test
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter any Natural Number");
  int n=sc.nextInt();
  int i=1,sum=0,fact=1;
  do
  {
     fact=i*i;
     System.out.print(fact);
     if(i<n)
     System.out.print("+");
     sum=sum+fact; 
     i++;
  } 
  while(i<=n);
  System.out.print("="+sum);
  }
  }
   
  
