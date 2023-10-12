class Power22{
  public static void main(String [] args){
	  java.util.Scanner sc=new java.util.Scanner(System.in);
	  System.out.println("Enter First Number");
	  int a = sc.nextInt();
	  System.out.println("Enter Second Number");
	  int b = sc.nextInt();
	  int i=1;
	  double pow=1;
	  double fact=1;
	  double sum=0;  
	  while(i<=b)
	  { 
	     pow=pow*a;
	     fact=fact*i;
	     sum=sum+pow/fact;
             System.out.print(a+"^" +i+ "/!" +i);
             if(i<b)
               System.out.print("+");
             i++;

          }
             System.out.println(" = " +sum);
             
}
}	  
