import java.util.Scanner;
class Sinc3
{
 public static void main(String args[])
  { 
    int  a=7,b;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your choice");
    int ch=sc.nextInt();
    switch(ch)
     { 
      case 1:b=--a + a-- + --a + --a + a--; 
             System.out.println("A="+a+"B="+b);
      } 
   }
 }           
