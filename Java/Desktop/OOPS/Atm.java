import java.util.Scanner;
class Test
{
     float bal;
     int pin=5678;
     public void checkpin()
     {      
          System.out.println("Enter a pin");
          Scanner sc=new Scanner(System.in);
          int pin2=sc.nextInt();
          if(pin2==pin)
          {
                menu();
          }
          else
          {  
                System.out.print("Try again\n");
                checkpin();
          }
     }
     public void menu()
     {
          System.out.println("Enter your choice\n"+"1.check A/c balance\n"+"2.Withdraw money\n"+"3.deposit money\n"+"4.EXit\n");
          Scanner sc=new Scanner(System.in);
          int opt=sc.nextInt();
          switch(opt)
          {
             case 1:
                 checkbal();
                 
             case 2:
                 withdraw();
                 
             case 3:
                 deposit();
                 
             case 4:
                 System.exit(0);        
             
            default :
                System.out.println("Enter a valid choice ");
             
          
          }
     }
     public void checkbal()
     {
         System.out.println(" Balance "+bal);
         menu();
     }
     public void withdraw()
     {
         System.out.println(" Enter the amount ");
         Scanner sc=new Scanner(System.in);
         float amt=sc.nextInt();
         if(amt>bal)
         {
             System.out.println("Insufficient balance");
         }
         else
         {
             bal=bal-amt;
             System.out.println("Withdraw successfull");
         }
         menu();
     }
     public void deposit()
     {
         System.out.println("Enter the amt.");
         Scanner sc=new Scanner(System.in);
         float amt=sc.nextInt();
         bal=bal+amt;
         System.out.println("money deposited successfully");
         menu();
     }
     
}
class Test1
{
     public static void main(String args[])
     {
         Test ob=new Test();
         ob.checkpin();
     }
}
