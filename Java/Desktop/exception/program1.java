 class Test {
    public static void main(String[] args) {
        int a[]=new int[5];
        int i=0;
        try{
             for(i=0;i<args.length;i++)
             {
                a[i]=Integer.parseInt(args[i]); 
             } 
          }    
        catch(ArrayIndexOutOfBoundsException ref)
            {
              System.out.println("Value should be <=5" );
            }
            for(int j=0;j<i;j++)
            
            System.out.println(a[j]);
    }
}
