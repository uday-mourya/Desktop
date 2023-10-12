class Power18{
public static void main(String [] args){
	  java.util.Scanner sc=new java.util.Scanner(System.in);
	  System.out.println("Enter first number");
	  int a = sc.nextInt();
	  System.out.println("Enter Second number");
	  int b = sc.nextInt();
	  int i=1;
	  double pow=1;
	  double sum=0;  
	  while(i<=b)
	  {
	     pow=pow*a/(i*2-1);
	     if(i%2==0){
	     sum=sum+pow;
	     if(i<=b){
                 System.out.print("+");
             }
             System.out.print((a+"^" +i+ "/" +(i*2-1));
             i++;
             }
             
             else
             {
               sum=sum-pow;
               if(i<b){
                 System.out.print("-");
               }
               System.out.print((a+"^" +i+ "/" +(i*2-1));
               i++;
             }
          }
             System.out.println(" = " +sum);
             
}
}	  
