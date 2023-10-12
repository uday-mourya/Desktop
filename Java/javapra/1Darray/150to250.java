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
  
    for(i=0;i<n;i++)
    {
     
      a[i]=sc.nextInt();
    }  
     for(i=0;i<n;i++)
     {
      if(a[i]>=150&&a[i]<=250)
       System.out.println("\t a["+i+"] = " +a[i]);
     }
   }
}   
