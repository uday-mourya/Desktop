import java.util.Scanner;
class Test
{
  public static void main(String [] args)
  {
   int k=1;
   do
    {
     Scanner sc=new Scanner(System.in); 
     System.out.println("Enter Number");
     int n=sc.nextInt();
   
    for(int x=1;x<=n;x++)
    {
      System.out.print("*");
    }
     System.out.println();
   } 
   while(k<'~');
    
  }
}  
