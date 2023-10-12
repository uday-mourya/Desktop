class U
{
     private static int count=0;
     public Obj()
     {
          count++;     
     }
     public static int getCount()
     {
          return count;
     } 
}
class Test
{
      public static void main(String args[])
      {
           U a=new U();
           U b=new U();     
           U c=new U();
           U d=new U();
           System.out.println("OBJECT = "+Obj.getCount());
      }

}
