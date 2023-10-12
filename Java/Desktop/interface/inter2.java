interface Inf1
{
  public abstract void display();
  void show();
}
class Uday implements Inf1
{
   public void display()
    {
       System.out.println("HELLO DISPLAY......");
    
    }
    public void show()
    {
      System.out.println("HELLO SHOW.....");
    
    }

}
class MyFactorial 
{
    public static void main(String [] args)
    {
        Uday ob= new Uday();
        ob.display();
        ob.show();
       //MyFactorial ob=new MyFactorial();
      // ob.display();
      // ob.show();
    }
   /* public void display()
    {
       System.out.println("HELLO DISPLAY......");
    
    }
    public void show()
    {
      System.out.println("HELLO SHOW.....");
    
    }*/
}
