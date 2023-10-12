import java.util.Scanner;
class Test
{
 public static void main(String arhs[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter any number");
  int n=sc.nextInt();
  int i=1;
  int sum=0,a=1;
  while(i<=n)
   { 
   System.out.print("+");
   sum=i*n;
   System.out.print("!"+i+"/"+i);
   a=i/sum;
    i++;
  } 
  System.out.print("=" +a);
 }
}    
