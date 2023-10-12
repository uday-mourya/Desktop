interface Inf1
{
  public abstract void calculate(int a,int b);
  //void show();
}
class Test 
{
    public static void main(String [] args)
    {
         Inf1 ref =new Inf1()
         {
          public int Calculate(int a,int b)
          {
             return a+b;
          }
         };
         Inf1 ref2=new Inf1()
         { 
           public int Calculate(int a,int b)
           {
             return a-b;
           }
         };
           System.out.println(ref1.Calculate(10,10));
           System.out.println(ref2.Calculate(20,20));
    }   
}
