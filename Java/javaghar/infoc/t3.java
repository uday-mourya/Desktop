import java.util.Scanner;
class Test3
{
 public static void main(String Args[])
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter any number");
  int a= sc.nextInt();
  int n=a/10;
  int lv=a%10;
  System.out.println("last value="+lv);
  a= a/10;
  int slv=a%10;
  System.out.println("second last value="+slv);
  a=a/10;
  int thv=a%10;
  System.out.println("Third value="+thv);
  a=a/10;
  int ft=a%10;
  System.out.println("last value="+ft);
  a=a/10;
  int fv=a%10;
  System.out.println("last value="+fv);   
  int sum=fv+lv;
  System.out.println("addition first value+last value="+sum);
  int sqr=sum*sum;
  System.out.println("square value="+sqr);
  int sum1=slv+ft;
  System.out.println("addition second value+fourth value="+sum1);
  int sqr1=sum1*sum1;
  System.out.println("Square value="+sqr1);
  int sqr2=thv*thv;
  System.out.println("mid square value="+sqr2);
  }
 } 
