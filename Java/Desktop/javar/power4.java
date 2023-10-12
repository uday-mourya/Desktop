class Power4{
  public static void main(String [] args){
	  java.util.Scanner sc=new java.util.Scanner(System.in);
	  System.out.println("Enter First Number");
	  int a = sc.nextInt();
	  System.out.println("Enter Second Number");
	  int b = sc.nextInt();
	  int i=1;
	  int pow=1;  
	  while(i<=b)
	  {
	     pow=pow*a/i;
             System.out.print(a+"^" +i+ "+");
             i++;

          }
             System.out.println(" = " +pow);
             
}
}	  
