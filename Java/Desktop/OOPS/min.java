import java.util.Scanner;
class Find
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
      System.out.println("Array Elements Are : ");
      for(int i=0;i<this.len;i++)
        System.out.println(a[i]);
    }
    
    public void min()
    {
      int min;
      min=a[0];
     for(int i=0;i<this.len;i++)
     {
        if(a[i]<min)
        min=a[i];
     }
     System.out.println("MINIMUM NUMBER = "+min);
    }
}
class Test
{
  public static void main(String [] args)
  {
    Scanner sc=new Scanner(System.in);
    Find ob=new Find();
    System.out.println("How Many Elements You Want To Entered");
    int k=sc.nextInt();   
    ob.setData(k);
    ob.inputArray();
    ob.showArray();
    ob.min();
  }
}  
