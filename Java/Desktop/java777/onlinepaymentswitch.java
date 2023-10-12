import java.util.Scanner;
class Online {
    public static void main(String[] args) {
    Scanner sc=new java.util.Scanner(System.in);
    System.out.println("Enter your password");
    int pass=sc.nextInt();
    int bal=20000;
    if(pass==12345){
    System.out.println("\tGpay\t\nEnter your choices" );
    System.out.println("\t1.for pay");
    System.out.println("\t2.for Check balance");
    System.out.println("\t3.for profile ");
    int ch=sc.nextInt();
    switch(ch){
    case 1:
        System.out.println("enter no.");
        int j=sc.nextInt();
        if(j==8602289){
          System.out.println("user 1");
          System.out.println("Enter your pay amt.");
        int a=sc.nextInt();
        if(a<=20000){
          1System.out.println("Enter UPI PIN");
        int b=sc.nextInt();
       
        if(b==2006){
          System.out.println("Your payment process");
          System.out.println("Your payment success");
          System.out.println("Your balance is "+(bal-a));
        break;
        }
        else
        {
           System.out.println("Incorrect PIN");
        break;
        }
    }
    else
    {
       System.out.println("Not having such amount");
    break;
    }
    }
    case 2:
        System.out.println("Enter UPI PIN");
        int c=sc.nextInt();
        if(c==2006){
        System.out.println("Your Balance is "+bal);
        }
        else
        {
        System.out.println("Incorrect PIN");  
        }
        break;
    case 3:
   
        System.out.println("\t*Uday Mourya");
        System.out.println("\t*8602289703");
        System.out.println("\t*ICIC BANK");
        System.out.println("\t*UPI:udaymourya2@icic");
       break;
    }
 }
else {
    System.out.println("\tIncorrect Password");
}
       
}
   
}
