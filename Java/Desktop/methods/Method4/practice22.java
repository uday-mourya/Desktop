class Test{
  public void patt() {
    
    int n = 5;    
    for (int i = 0;i<n; i++)
     {  
        for (int j = 0; j<n; j++) 
      {
        if(i==j||i+j==(n-1))
        {
          System.out.print(" * ");
        } 
       else
       {
         System.out.print("   "); 
       }
       
    }
     System.out.println();
  }
   public static void main(String [] args)
   {
      Test ob= new Test();
      ob.patt();
   
   }
}
}
