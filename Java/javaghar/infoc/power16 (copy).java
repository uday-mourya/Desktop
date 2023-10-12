import java.util.Scanner;
class Test
{
  public static void main(String args[])
 { 
  Scanner sc=new Scanner(System.in);
  System.out.println("enter two value");
  int x=sc.nextInt();
  int y=sc.nextInt();
  int i=1;
  double power=1,sum=0,k=0;
  while(i<=y)
  {
   power=power*x;
   k=power/(2*i-1);
   if(i%2==0)
   {
   System.out.print(x+"^"+i+"/"+(2*i-1)+"+");
   sum=sum-k;}
   else{
   System.out.print(x+"^"+i+"/"+(2*i-1));
   sum=sum+k;
   if(i<y)
   System.out.print("-");}
   i++;
   }
   System.out.print("="+sum);
   }
   }
