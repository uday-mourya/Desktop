import java.util.Scanner;
class First
{   private int n;  
    public void setData(int n)
    { 
      this.n=n;  
    }
    public void Table()
     {
        if(this.n%4==0||this.n%100==0&&this.n%400==0)
        {
          System.out.println("This Year Is Leap Year");
        }
        else
        {
          System.out.println("Not Leap Year");
        } 
     }
}    
class Test
{
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Year");
      int n = sc.nextInt();
      First ob=new First();
      ob.setData(n);
      ob.Table();
   	   
    }
 }  	  
