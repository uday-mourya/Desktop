class Power14{
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
	     pow=(i+1)/pow*a;
	     if(i%2==0){
	     sum=sum-pow;
             System.out.print((i+1)+ "/" +a+ "^" +i);
             if(i<b){
                 System.out.print("+");
             }
             i++;
             }
             
             else
             {
               sum=sum+pow;
               System.out.print((i+1)+ "/" +a+ "^" +i);
               if(i<b){
                 System.out.print("-");
               }
               i++;
             }
          }
             System.out.println(" = " +sum);
             
}
}	  
