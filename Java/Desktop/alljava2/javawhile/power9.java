class Power9{
  public static void main(String [] args){
	  java.util.Scanner sc=new java.util.Scanner(System.in);
	  System.out.println("Enter First Number");
	  int a = sc.nextInt();
	  System.out.println("Enter Second Number");
	  int b = sc.nextInt();
	  int i=1;
	  double pow=1;
	  double sum=0;  
	  while(i<=b)
	  {
	     pow=i/pow*a;
	      
	     if(i%2==0){
	     sum=sum+pow;
	     if(i<=b){
	       System.out.print("+");
	     }
             System.out.print(i+"/" +a+ "^" +i);
             i++;
	  }
	  else{
	   sum=sum-pow;
	   if(i<b){
             System.out.print("-");
             }
	   System.out.print(i+ "/" +a+ "^" +i);
	      i++;
          
          }
          }
          
             System.out.println(a+" = " +pow);
             
}
}	  
