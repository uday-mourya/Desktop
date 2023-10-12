import java.util.Scanner;
class Colo
{
 public static void main(String Args[])
 { 
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter any amount");
  int a= sc.nextInt();
  if(a>=500)
  {
   int n=a/500;
   System.out.println("500="+n);
   a=a%500;
  } 
 if(a>=200)
  {
   int n=a/200;
   System.out.println("200="+n);
   a=a%200;
  } 
  if(a>=100)
  {
   int n=a/100;
   System.out.println("100="+n);
   a=a%100;
  } 
  if(a>=50)
  {
   int n=a/50;
   System.out.println("50="+n);
   a=a%50;
  } 
  if(a>=20)
  {
   int n=a/20;
   System.out.println("20="+n);
   a=a%20;
  } 
  if(a>=10)
  {
   int n=a/10;
   System.out.println("10="+n);
   a=a%10;
  } 
  if(a>=5)
  {
   int n=a/5;
   System.out.println("5="+n);
   a=a%5;
  } 
  if(a>=2)
  {
   int n=a/2;
   System.out.println("2="+n);
   a=a%2;
  } 
  if(a>=1)
  {
   int n=a/1;
   System.out.println("1="+n);
   a=a%=1;
  }  
 } 
}
