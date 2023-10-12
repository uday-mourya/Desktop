import java.lang.String;
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter physics");
        int p=sc.nextInt();
  System.out.println("enter chemistry ");
        int c=sc.nextInt();
  System.out.println("enter Maths ");
        int m=sc.nextInt();
  System.out.println("enter english ");
        int e=sc.nextInt();
  System.out.println("enter hindi  ");
        int h=sc.nextInt();
  int total=p+c+m+e+h;
  double per=total/5.0;   
  
if(p<33){
    if(c<33) {
        if(m<33){
            if(e<33){
                if(h<33)
                {
    System.out.println("fail in all subject");
                }
                else
                {
    System.out.println(" execept 4 subjects");
                }
                   
                }
               
                else
                {
                  if(h<33){
    System.out.println(" fail in 4 subjects ");
                  }
                  else
                  {
    System.out.println("fail in 3 subjects");  
                  }
                }
            }
            else
            { 
            if(e<33)
              {
              if(h<33){    
    System.out.println("fail in 4 subjects ");
              }
                else{
    System.out.println("fail in 3 subjects"); 
                }  
                    
                }
               else{
                   if(h<33){
    System.out.println("fail in 3 subjects");
                   }
                   else
                   {
    System.out.println("fail in 2 subject ");   
                   }
                      
                   }
                      
                   }
               }
               else {
                   if(m<33){
                       if(e<33){
                           if(h<33){
    System.out.println(" fail in 4 subjects");
                           }
                           else{
    System.out.println("fail in 3 subjects");                          
                           }   
                           }
                           else{
                               if(h<33)
                               {
                         System.out.println("fail in 3 subjects");                              
                               }
                               else
                               {
                         System.out.println("fail in 2 subject");                              
                                  
                           }
                              
                           }
                       }
                       else{
                          if(e<33)
                          {
                            if(h<33){
                                   System.out.println("fail in 3 subject");
                              }
                              else{
                                   System.out.println("fail in 2 subject");
                              }
                          }
                          else{
                              if(h<33)
                              {
                                     System.out.println("fail in 2 subject");
                              }
                              else
                              {
                                     System.out.println("fail in 1 subject");
                              }
                          }
                       }
                   }
                      
                   }
                   else
                   {
                     if(c<33)
                     {
                       if(m<33)
                       {
                         if(e<33)
                         {
                           if(h<33)
                           {
                           System.out.println("fail in 4 subject");
                           }
                           else
                           {
                           System.out.println("fail in 3 subject");
                           }
                           
                        }
                         else
                         {
                         if(h<33)
                         {
                          System.out.println("fail in 3 subject");        
                         }
                         else
                         {
                         System.out.println("fail in 2 subject");
                         }
                         }
                       }
                     
                     else
                     {
                       if(e<33)
                       {
                       if(h<33)
                       {
                       System.out.println("fail in 3 subject");
                       }
                       else
                       {
                       System.out.println("fail in 2 subject");
                       }
                       }
                       else
                       {
                       if(h<33)
                       {
                       System.out.println("fail in 2 subject");
                       }
                       else
                       {
                       System.out.println("fail in 1 subject");
                       }
                       }
                     }
                     }
                     else
                     {
                     if(m<33)
                     {
                       if(e<33)
                       {
                         if(h<33)
                         {
                         System.out.println("fail in 3 subject");
                         }
                         else
                         {
                         System.out.println("fail in 2 subject");
                         }
                       }
                       else
                       {
                       if(h<33)
                       {
                       System.out.println("fail in 2 subject");
                       }
                       else
                       {
                       System.out.println("fail in 1 subject");
                       }
                       }
                     }
                     else
                     {
                     if(e<33)
                        {
                         if(h<33)
                           {
                             System.out.println("fail in 2 subject");                     
                           }
                           else
                           {
                           System.out.println("fail in 1 subject");
                           }
                     }
                     else
                     {
                     if(h<33)
                        {
                         System.out.println("fail in 1 subject");                      
                        }
                        else
                        {
                        System.out.println("Pass");
                        System.out.println("Percentage " +per);
                        }
                     }
                     }
                     }
                   }
               }
            }
           
               
           
        
   
 
