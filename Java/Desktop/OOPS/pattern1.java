import java.util.Scanner;
class Find
{  
    private int a;
    public void setData(int a)
    { 
       this.a=a;
    }
   
    public void pattern()
    { 
       
      for(int i=1;i<=this.a;i++)
      {
        for(int j=1;j<=i;j++)
        {
          System.out.print(i+" ");
        }
          System.out.println();   
      }  
    }   
    
}
class Test
{    
    public static void main(String [] args)
    { 
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Pattern Size");
      int k=sc.nextInt();
      Find ob=new Find();
      ob.setData(k);    
      ob.pattern();
      
    }
}
   
