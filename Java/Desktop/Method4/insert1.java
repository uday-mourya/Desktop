import java.util.Scanner;
class Test
{
  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
     int a[] = new int[20];
     System.out.println("Enter how many elements you want in array");
     int n = sc.nextInt();
     int i;
    
     for (i=0;i<n;i++) 
     {
       System.out.print("a["+i+"]=");
       a[i] = sc.nextInt(); 
     }
    

    System.out.println("\n\nArray is:");   
    for (i=0;i<n;i++)
    {
      System.out.println("a["+i+"]="+a[i]); 
    }
      System.out.println("Enter value you wnt to enter");
      int x=sc.nextInt();
      System.out.println("Enter index for where you wnt value ");
     
      int y=sc.nextInt();
      
    if(y<n)
    {
      int temp=0;
      for(i=0;i<n;i++)
      {
        if(i==y)
        {
          temp=a[y];
          a[y]=temp;
          a[y]=x;
        }
      } 
       System.out.println("your updated array is ");
      for(i=0;i<n;i++)
       {
         System.out.println(" "+a[i]);    
       }  
   
     }
     else
    {
      System.out.print("wrong index.");
    }
 }
}
    
    
