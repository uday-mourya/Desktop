import java.util.Scanner;
class Interest{
  public static void main (String [] args)
  {
  	  Scanner sc = new Scanner (System.in);
  	  System.out.println("Enter Your Amount :");
  	  int a = sc.nextInt();
  	  System.out.println("Enter Your Interest :");
          int b = sc.nextInt();
          System.out.println("Enter Year");
          int c = sc.nextInt();
           int f= a*b*c;
           int z=f/100;
           int fullamount =z+a;
           System.out.println("Full Amount" +fullamount);


}
}
