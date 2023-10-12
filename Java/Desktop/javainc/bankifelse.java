import java.util.Scanner;
class Pass
{
  public static void main(String args[])
    {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter Password");
   int pa=sc.nextInt();
   if(pa==123456)
   {
    System.out.println("\tYour Choice\n");
    System.out.println("\t# Press 1 For Check Account Balance\n");  
    System.out.println("\t# Press 2 For Deposit money\n");
    System.out.println("\t# Press 3 For Withdrawal money\n");
    System.out.print("\tEnter any Choice :");
    int ch=sc.nextInt();
    double ab=18000;
     if(ch==1)
     {
       System.out.println("\tYour Account Balance is "+ab+" RS");
     }
     else if(ch==2)
     {
       System.out.print("\tEnter Deposit Money In Rs:");
       double de=sc.nextDouble();
       System.out.println("\tDeposit money is "+de+" RS\n");
       ab = ab+de;
       System.out.println("\tYour  Balance is "+ab+" RS");
     }
     else if(ch==3)
     {
       System.out.println("\tEnter Withdrawal Money In RS\n");
       double wd=sc.nextDouble();
         if(wd>18000)
         {
           System.out.println("\tYour Balance is Low only "+ab+" RS\n");
         }
         else
         {
         System.out.println("\tWithdrawal money is "+wd+" RS\n");
         ab = ab-wd;
         System.out.println("\tYour  Balance is "+ab+" RS\n");
         }
      }
      else
      {
        System.out.println("\tEnter valid Choice");
      }
     }
   else
        System.out.println("\tIncorrect Password");    
   }
}


