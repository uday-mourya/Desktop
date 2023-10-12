import java.util.Scanner;
class Test
{
  public static void main(String args[])
  {
    int i;
    Scanner sc=new Scanner(System.in);
    System.out.print("\tHow many element you want to Enter : ");
    int n=sc.nextInt();
    int a[]=new int[n];
    System.out.println("\tMax size of Array = "+a.length);  
    System.out.println("\tEnter element in Array : ");
  
    for(i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
    System.out.println("\tArray Elements Are");
    for(i=0;i<n;i++)
    {
      System.out.println("\ta["+i+"] = "+a[i]);
    }
   }
} 
