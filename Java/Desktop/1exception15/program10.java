class SquareRootException extends Exception {
    public SquareRootException(String message) {
        super(message);
    }
}

class Main {
    public static void main(String[] args) {
        ;
        try {
        	    int  a=Integer.parseInt(args[0]);
               
               if (a < 0)
                {
                    throw new SquareRootException("Number cannot be negative.");
                }
              double sqrt = Math.sqrt(a);
              System.out.println("Square root of " + a + ": " + sqrt);
          }  
         catch (SquareRootException e) 
         {
            System.out.println(e.getMessage());
         }
    }
}
