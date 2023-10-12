import java.util.Scanner;
class Test
{
  public static void main(String args[])
  {
    boolean b=false;
    Scanner sc=new Scanner(System.in);
     int a[]=new int[20];
    System.out.print("\tHow many element you want to Enter : ");
    int n=sc.nextInt();
   
    System.out.println("\tEnter element in Array : ");
    for(int i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
     System.out.println("Enter element you want to search");
     int item=sc.nextInt();
    for(int i=0;i<n;i++)
    {
      if(a[i]==item)
        b =true;
    }
    if(b)
      System.out.println("Item Found");
    else  
      System.out.println("Item Not Found");  
    
   }
} 
