abstract class Test
{ 
   int x;
   public Test(int x)
   {
       this.x=x;
   }
   public abstract void display();
}
class Test1 extends Test
{  
   int y;
   public Test1(int x1,int x2)
   {
     super(x1);
     this.y=x2;
   }
   public void display()
   {
     System.out.println("x="+this.x);
     System.out.println("Y="+y);
     System.out.println("----------");
   }
}
class Test2 extends Test 
{
  int z;
  public Test2(int x1,int x2)
  {
    super(x1);
    this.z=x2;
  }
  public void display()
  {
    System.out.println("x="+this.x);
    System.out.println("y="+this.z);
  
  }
}
class Testmain
{
   public static void main(String [] args)
   {
   
     Test ref;
     Test1 a=new Test1(10,35);
     Test2 b=new Test2(67,34);
      
     ref=a;
     ref.display();
     
     ref=b;
     ref.display();
   }
}

