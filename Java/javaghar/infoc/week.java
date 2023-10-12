import java.util.Scanner;
class Week
{ 
 public static void main(String args[])
  { 
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the week number");
    int day=sc.nextInt();
    switch(day)
         {
           case 1: System.out.println("MONADY");
                   break;
           case 2: System.out.println("TUESDAY");
                   break;
           case 3: System.out.println("WEDNESDAY");
                   break;
           case 4: System.out.println("THURSDAY");
                   break;
           case 5: System.out.println("FRIDAY");
                   break;
           case 6: System.out.println("SATURDAY");
                   break;
           case 7: System.out.println("SUNDAY");
                   break;
                   default;
                   System.out.println("YOU ARE WRONG PERSON");
         }                           
    }         
  }  
