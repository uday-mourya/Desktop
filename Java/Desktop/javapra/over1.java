class Test
{
   public int add(int a,int b)
   {
     return a+b;
   }
   public  double(int a,int b)
   {
      return a+b;
   }
   public int add(int a,int b,int c)
   {
     return a+b+c;
   }
   public double add(int a,int b,int c,int d)
   {
     return a+b+c+d;
   }
   
   public static void main(String [] args)
   {
     Test ob=new Test();
     System.out.println(ob.add(6,9));
     System.out.println(ob.add(6,9,7));
     System.out.println(ob.add(6.0,5.5,7.5,8.8));
     System.out.println();
     
   }

}   
   
