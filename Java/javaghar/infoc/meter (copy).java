import java.util.Scanner;
class Bill
{
public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the curret month units");
  int cu=sc.nextInt();
  System.out.println("Enter the last month units");
  int lu=sc.nextInt();
  int tu=cu-lu;
  System.out.println("Total  unit="+tu);
   int bill=tu*5;
   float bil=(float)(tu*7.5f);
   float bi=(float)(tu*12.5f);
   int b=tu*16;
   if(tu<=100)
    {
     bill=tu*5;
    System.out.println("biil ganerate 100units="+bill);
    }
    else if(tu<=200)
        {
         bil=tu*7.5f;
         System.out.println("bill ganerate 200units="+bil);
        }
      else if(tu<=300)
         { 
           bi=tu*12.5f;
          System.out.println("bill ganerate 300units="+bi);
          }
           else if(300<tu)    
              {
                b=tu*16;
                System.out.println("bill ganerate 300 above units="+b);
              }
        }
      }
   
 
