class Test{
  public static void main(String args[]){
	int n=5; 
	int i,j,k,a;
    
	for(i=1;i<=5;i++)
       {
         for(j=1;j<=n-i;j++)
         {
           System.out.print("   ");
         }
           for(k=1;k<=i*2-1;k++)
           {
             a = i*2-1;
              System.out.print(" "+ a+" ");
           }
            System.out.println();
        for(j=1;j<=n-i;j++)
        {
         System.out.print("   ");
        }
          for(k=1;k<=i*2-1;k++){
          a = i*2-1;
           System.out.print(" "+a+" ");
          }
            System.out.println();
       }
  
}
}
