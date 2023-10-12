class Power5{
  public static void main(String [] args){
	  java.util.Scanner sc=new java.util.Scanner(System.in);
	  System.out.println("Enter First Number");
	  int a = sc.nextInt();
	  System.out.println("Enter Second Number");
	  int b = sc.nextInt();
	  int i=1;
	  int pow=1;
	  int sum=0;  
	  while(i<=b)
	  {
	     pow=pow*a/i;
	      
	     if(i%2==0){
	     sum=sum-pow;
             System.out.print(a+"^/" +i+ "+");
             if(i<b){
	       System.out.print("+");
	     }
             i++;
	  }
	  else{
	   sum=sum+pow;
	   System.out.print(a+ "^/" +i);
	   if(i<b){
             System.out.print("-");
             }
	      i++;
          
          }
          }
          
             System.out.println(a+" = " +pow);
             
}
}	  
