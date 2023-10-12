import java.util.Scanner;
class Arrayoperation
{  
    private int a[];
    private int len;
    public void setData(int len)
    {
       this.a=new int [10]; 
       this.len=len;
   }
    public int len()
    {
       return a.length;
    }
    public void inputArray()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Array Elements");
      for(int i=0;i<this.len;i++)
        a[i]=sc.nextInt();  
    }
   
    public void showArray()
    { 
       System.out.println("Array Elements Are ");
      for(int i=0;i<this.len;i++)
      {
         System.out.println(a[i]); 
      }  
    }   
    public void max()
    { 
       int max;
       max=a[0];
      for(int i=0;i<this.len;i++)
      {
         if(max<a[i])
         max=a[i];
      } 
        System.out.println("Max : "+max); 
    }
}
class Test
{    
    public static void main(String [] args)
    { 
      Scanner sc=new Scanner(System.in);
      System.out.println("How Many Elements You Wants To Entered");
      int k=sc.nextInt();
      Arrayoperation ob=new Arrayoperation();
      ob.setData(k);
      ob.len();
      ob.inputArray();
      ob.showArray();
      ob.max();
      
    }
}
   
