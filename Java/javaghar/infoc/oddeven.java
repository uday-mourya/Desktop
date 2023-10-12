import java.util.Scanner;
class Test
{
 public static void main(String args[])
 { 
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter any number");
  int n=sc.nextInt();
  int i=1;
  int esum=0,osum=0,sum=0;
  while(i<=n)
  {    
   System.out.print(i);
   if(i%2==0)
   {
   System.out.print("-");
    esum=esum-i;
   else 
   if(i<n)
    System.out.print("+");
    osum=osum+i;
    i++;
  } 
   sum=+osum-esum;
   System.out.println("="+sum);
} 
}
}
