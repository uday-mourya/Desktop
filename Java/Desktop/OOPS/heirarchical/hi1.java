class Testmain
{
   public static void main(String [] args)
   {
      Subs a=new Subs(10,11,7);
      // a.setData(10,11);
      a.substraction();
   }
}
class Add
{
  int a,b;
  public void Add(int a,int b)
  {
    
    this.a=a;
    this.b=b;
  
  }
  public void  add()
  {    
     System.out.println(this.a+this.b);
  } 
}
class Subs extends Add
{
   int c;
   public Subs(int a,int b,int c)
   {
      super(a,b);
      this.c=c;
   }
   public void substraction()
   {
      super.add();
      System.out.println(this.a-this.c);
   }
}
class Multi extends Add
{
   int c;
   public Subs(int a,int b,int c)
   {
      super(a,b);
      this.c=c;
   }
   public void substraction()
   {
      super.add();
      System.out.println(this.a*this.c);
   }
}

