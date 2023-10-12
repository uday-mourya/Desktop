class Power3{
  public static void main(String [] args){
	  java.util.Scanner sc=new java.util.Scanner(System.in);
	  System.out.println("Enter first number");
	  int a = sc.nextInt();
	  System.out.println("Enter Second number");
	  int b = sc.nextInt();
	  int i=1;
	  int pow=1;
	  int sum=0;  
	  while(i<=b)
	  {
	     pow=pow*a;
            if(i%2==0){
	     sum=sum+pow;
	     if(i<=b){
	        System.out.print("+");
	     }
             System.out.print(a+ "^" +i);
             i++;
             }
              
             else
             {
               sum=sum-pow;
               if(i<b){
                  System.out.print("-");
               }
               System.out.print(a+ "^" +i);
               
               i++;
             }
          }
             System.out.println( " = " +sum);
             
}
}	  
