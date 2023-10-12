class Test{
  public static void main(String [] args){
	java.util.Scanner sc=new java.util.Scanner(System.in);
	System.out.println("Enter Any Number");
	int  n=sc.nextInt();
	int sum=0;
	int fact=1;
	int i=2;
	int a=1;
	while(a<=n)
	{ 
	  if(i%2==0){
          fact=fact*i*2;
         //System.out.println();
          sum=sum+fact;
          a++;
         }
         i++;
        }
          System.out.println("Sum ="+sum);
  }
 } 
