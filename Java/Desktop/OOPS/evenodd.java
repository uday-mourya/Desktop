import java.util.Scanner;
class Even
{  
    private int a;
    public void setData(int a)
    {
       this.a=a; 
       
    }
    public void getData()
    {
       System.out.println("A="+this.a);
    }
    public void check()
    {
      if(this.a%2==0)
          System.out.println("Your No.IS Even");
      else 
          System.out.println("NO IS ODD");      
    }
}
class Test
{    
    public static void main(String [] args)
    { 
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Number");
      int n=sc.nextInt();
      Even ob=new Even();
      ob.setData(n);
      ob.check();
    }
}
   
