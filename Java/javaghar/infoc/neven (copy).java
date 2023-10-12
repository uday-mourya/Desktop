import java.util.Scanner;
class Test
{
 public static void main(String args[])
 { 
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter any number");
  int n=sc.nextInt();
  int i=1;
  while(i<=n)
  {    
    int j=i*2; 
    System.out.print(" "+j);
    i++;
   } 
 } 
}
