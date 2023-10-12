import java.util.Scanner;
class Test
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter your quantity");
  int quan=sc.nextInt();
  int dis;
  if(1000<=quan)
  {
  dis=quan*100/100*10;
  System.out.println("Discount:"+dis);
  }
  else  
   System.out.println("No Discount quantity less then 1000");
   }
  } 
