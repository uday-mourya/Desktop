class Test
{
   public int add(int a,int b)
   {
     return a+b;
   }
   public int add(int a,int b,int c)
   {
     return this.add(a,b)+c;
   }
   public int add(int a,int b,int c,int d)
   {
     return this.add(a,b,c)+d;
   }
   
   public static void main(String [] args)
   {
     Test ob=new Test();
     System.out.println(ob.add(6,9));
     System.out.println(ob.add(6,9,7));
     System.out.println(ob.add(6,5,7,8));
     
   }

}   
   
