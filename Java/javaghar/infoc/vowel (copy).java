import java.util.Scanner;
class Vowel
{ 
 public static void main(String args[])
  { 
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Character");
    int ch=sc.nextInt();
    switch(ch)
         {
           case a: System.out.println("vowel");
                   break;
           case A: System.out.println("vowel");
                   break;        
           case e: System.out.println("vowel");
                   break;
           case E: System.out.println("vowel");
                   break;        
           case i: System.out.println("vowel");
                   break;
           case I: System.out.println("vowel");
                   break;        
           case o: System.out.println("vowel");
                   break;
           case O: System.out.println("vowel");
                   break;        
           case u: System.out.println("vowel");
                   break;
           case U: System.out.println("vowel");
                   break;        
                  default:
                  System.out.println("Consonant Character");
          }     
   }
 }         
