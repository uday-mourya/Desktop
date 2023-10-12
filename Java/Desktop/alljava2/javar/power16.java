class Power16{
  public static void main(String [] args){
	  java.util.Scanner sc=new java.util.Scanner(System.in);
	  System.out.println("Enter First Number");
	  int a = sc.nextInt();
	  System.out.println("Enter Second Number");
	  int b = sc.nextInt();
	  int i=1;
	  double pow=1;  
	  while(i<=b)
	  {
	     pow=pow*a/(i*2-1);
             System.out.print(a+"^" +i+ "/" +(i*2-1));
             if(i<b)
               System.out.print("+");
             i++;

          }
             System.out.println(" = " +pow);
             
}
}	  
