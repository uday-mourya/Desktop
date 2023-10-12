import java.util.Scanner;
class Marks
{
public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter phy ");
  int p=sc.nextInt();
  System.out.println("Enter chem ");
  int c=sc.nextInt();
  System.out.println("Enter math ");
  int m=sc.nextInt();  
  if(p<33){
  if(c<33){
  if(m<33){
  System.out.println("All sub Fail");
  }else{
  System.out.println("Fail in phy and chem");
  }
  }else{
     if(m<33){
       System.out.println("Fail is phy and maths");
     }else{
     System.out.println("fail in phy");       
     }
   }                        
   }else{
    if(c<33){ 
    if(m<3){
          System.out.println("Fail in chem and math");
         }else{
            System.out.println("Fail in chem");
         }
         }else{
          if(m<33){
            System.out.println("Fail in maths");
            }else{ 
            int per=(p+c+m)/3;
            if(per<0){
                System.out.println("Invalid percentage");
              }else{
               if(per>100){
                  System.out.println("Invalid percentage");
                }else{ 
                 if(per>60){
                   System.out.println("pass by 1st division");
                  }else{
                   if(per>45){
                      System.out.println("pass by 2nd division");
                     }else{
                      if(per>=33){
                         System.out.println("pass by 3rd division");
                       } 
                    }
                  }
               }
            }         
         }                
      }
    }
  }
}
          
     
   
 

