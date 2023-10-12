import java.util.Scanner;
class Test{
  public static void main(String args[]){
  
    Scanner sc=new Scanner(System.in);
    System.out.print("\tHow many element you want to Enter : ");
    int n=sc.nextInt();
    int a[]=new int[n];
    System.out.println("\tMax size of Array = "+a.length);  
    System.out.println("\tEnter element in Array : ");
    
    int temp; 
    for(int i=0;i<n;i++)
      a[i]=sc.nextInt();
      
    System.out.println("before swaping");
    for(int i=0;i<n;i++)
    System.out.println("\ta["+(i)+"]="+a[i]);

    System.out.println("After Swapping"); 
    for(int i=0;i<n;i++){ 
         temp=a[i];
         a[i]=a[n-i-1];
         a[n-i-1]=temp;
    
   }
   
      System.out.println("\t a["+i+"] = "+a[i]);
   }
} 
