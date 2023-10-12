import java.util.Scanner;
class Size 
{
 public static void main(String args[])
  {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the value");
  int s=sc.nextInt();
  if(s<=28)
    System.out.println("Small Size");
    else if(s<=36)
    System.out.println("Medium Size");  
 else if(s<=45)
    System.out.println("Large Size");
    else
    System.out.println("Extra Large size");     
    
  }  
}  
