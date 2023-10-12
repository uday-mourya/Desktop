class Test
{
  public void loop()
   {
	java.util.Scanner sc=new java.util.Scanner(System.in);
        int a[] ={1,2,3,4,5};
        
        for(int i=0;i<a.length;i++)
          System.out.println(a[i]);
        // For each Loop;    
        System.out.println("Array Elements Are"); 
        for(int x:a)                                                                         
          System.out.println(x);
            
         /*for(String x:a)
            System.out.println(x);
          */
   }
   
   public static void main(String [] args)
   { 
     Test ob=new Test();
     ob.loop();
   
   }
}          
