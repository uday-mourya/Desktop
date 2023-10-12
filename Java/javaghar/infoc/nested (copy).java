import java.util.Scanner;
class Even
{
 public static void main(String Args[])
 { 
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter any  number");
  int a =sc.nextInt();
  int b =sc.nextInt();
  if(a==b)
    System.out.println("Both are same");
     else
     {
       if(a>b)
          System.out.println("A is max");
       else
          System.out.println("B is max");
     }
 }
}       
