import java.util.Scanner;
class Test
{ 
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter any number");
  int n= sc.nextInt();
  int i=1;
  int sum=1,a=0;
  while(i<=10)
  {
    sum=n*i;
    a=sum+a;
    System.out.println(+n+"*"+i+"="+sum);
    i++;
   } 
   System.out.println("="+a);
 }   
}    
     
    
