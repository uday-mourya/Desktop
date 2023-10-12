import java.util.Scanner;
class Test{
  public static void main(String args[]){
  
    int i,sum=0;
    Scanner sc=new Scanner(System.in);
    System.out.print("\tHow many element you want to Enter : ");
    int n=sc.nextInt();
    int a[]=new int[n];
    System.out.println("\tMax size of Array = "+a.length);  
    System.out.println("\tEnter element in Array : ");
    int c=0,b=0;
    for(i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }  
     for(i=0;i<n;i++)
     {        
       if(a[i]%2==0)
       c++;
       else  
       b++;
     }
     
       System.out.println("Even No = "+c); 
       System.out.println("Odd  NO = "+b);  
   }
}   
