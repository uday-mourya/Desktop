import java.lang.String;
import java.lang.System;
import java.util.Scanner;
class Marksheet
{
 public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in); 
    System.out.println("enter university name");
    String DAVV = sc.nextLine();
    System.out.println("Enter  roll number");
    String roll = sc.nextLine();
    System.out.println("Enter course name");
    String course = sc.nextLine();
    System.out.println("Enter your name");
    String name = sc.nextLine(); 
    System.out.println("enter Branch name");
    String Branch = sc.nextLine();
    System.out.println("Enter father name");
    String father = sc.nextLine();
    System.out.println("Enter mother name");
    String mother = sc.nextLine();
    System.out.println("Enter sem name");
    String SEM = sc.nextLine();
    System.out.println("Enter year");
    String year = sc.nextLine(); 
   
  
    System.out.println("Enter your physics marks");  
    int p=sc.nextInt();
    System.out.println("Enter your Chemistry marks");
    int c=sc.nextInt();
    System.out.println("Enter your Maths marks ");
    int m=sc.nextInt(); 
    System.out.println("Enter your Hindi marks ");
    int h=sc.nextInt(); 
    System.out.println("Enter your English marks");
    int e=sc.nextInt();
    System.out.println("___________________________________________________________________________________");
    System.out.println("|\t\t\t\t"+DAVV+"\t\t\t\t\t   |");
    System.out.println("|\t\t\t\t\t\t\t\t\t\t   |");
    System.out.println("|   Roll\t:"+roll+"\t\t\t\t\t\tCourse:"+course+"\t   |");
    System.out.println("|   Name\t:"+name+"\t\t\t\t\tBranch:"+Branch+"\t   |");
    System.out.println("|   Father name :"+father+"\t\t\t\t\tsem:"+SEM+"\t\t   |");
    System.out.println("|   Mother name :"+mother+"\t\t\t\t\tyear:"+year+"\t   |");
    System.out.println("|\t\t\t\t\t\t\t\t\t\t   |");
    System.out.println("|   SubCode\t\tSubName\t\tMaxMarks\tMinMarks\tObtMarks   |");
    System.out.println("|   Bse-502\t\tPhysics  \t70\t\t33\t\t"+p+"\t   |");
    System.out.println("|   Bse-503\t\tChemistry\t70\t\t33\t\t"+c+"\t   |");
    System.out.println("|   Bse-507\t\tMaths    \t70\t\t33\t\t"+m+"\t   |");
    System.out.println("|   Bse-509\t\tHindi    \t70\t\t33\t\t"+h+"\t   |");
    System.out.println("|   Bse-505\t\tEnglish  \t70\t\t33\t\t"+e+"\t   |");
    System.out.println("|__________________________________________________________________________________| ");
    if(p<33)
     {
      if(c<33)
       {
        if(m<33)
         {
          if(h<33)
           {
            if(e<33)
               System.out.println("all subject fail");
                   else
                    {
                      System.out.println("passed in one sub english");
                      System.out.println("fail in four sub  phy and chem and hindi and maths");
                    }
          }
        else/*h*/        
          {
             if(e<33)
                {
                  System.out.println("passed in one sub hindi");
                  System.out.println("fail in four sub phy and chem and english and maths");
                }
             else
               {
                 System.out.println("passed in two subject hindi and english");
                 System.out.println("fail in three subject phy and chem and maths");
               }
                 
        }/*h*/
      }/*m*/  
     else/*m*/
        {
             if(h<33)
                 {
                   if(e<33)
                   {
                      System.out.println("passed in one sub is maths");
                       System.out.println("fail in four sub is phy and chem and english and hindi");
                   }
                   else
                    {
                     System.out.println("passed in two english and maths");
                      System.out.println("fail in three sub phy and chem and hindi");
                    }
                 }/*h*/
             else
             {
                   if(e<33)
                   {
                     System.out.println("passed in two hindi and maths");
                     System.out.println("fail in three sub phy and chem and english"); 
                   }
                    else 
                      {
                       System.out.println("passed in three sub maths and english and hindi");
                       System.out.println("fail in two phy and chem");
                      }
              }
   
        }/*m*/
     }/*c*/
        else/*c*/
        {
          if(m<33)
           {
             if(h<33)
              {
               if(e<33)
                {
                 System.out.println("passed in one  sub chemistry  ");
                 System.out.println("fail in four subject physics and math and english and hindi"); 
                }
               else
                {
                 System.out.println("passed in two subject english and chemistry");
                 System.out.println("fail in three subject hindi and physics and maths "); 
                }
             }/*h*/
             else
             {
               if(e<33)
                {
                 System.out.println("passed in two subject hindi and chemistry");
                 System.out.println("fail in three subject english and physics and maths ");
                }
               else
                {
                 System.out.println("passed in three subject english and hindi and chemistry");
                 System.out.println("fail in two subject physics and maths "); 
                }
             }
         }/*m*/
          else
           {
            if(h<33)
              {
             if(e<33)
                {
                 System.out.println("passed in two subject  chemistry and maths");
                 System.out.println("fail in three subject hindi and physics and english "); 
                }  
             else
              { 
                System.out.println("passed in three subject chemistry and maths and english");
                System.out.println("fail in two subject hindi and physics ");  
              }
          }/*h*/
          else
            {
             if(e<33)
               {
                System.out.println("passed in three subject chemistry and maths and hindi");
                System.out.println("fail in two subject english and physics "); 
               }
             else
             { 
                System.out.println("passed in four subject chemistry and maths and english and hindi");
                System.out.println("fail in one subject physics "); 
             }
           }
        }
      }/*c*/
 }/*p*/
else/*p*/
     {
       if(c<33)
         {
           if(m<33)
             {
             if(h<33)
                {
                  if(e<33)
                      {
                        System.out.println("pass in one subject physics ");
                        System.out.println("fail in four subject chemistry and maths and english and hindi");
                      }
                     else
                     {
                      System.out.println("passed in two  subject physics  and English");
                      System.out.println("fail in three subject chemistry and maths and hindi"); 
                     }
                     
                }
                else
                {
                  if(e<33)
                    {
                      System.out.println("passed in two  subject physics  and hindi");
                      System.out.println("fail in three subject chemistry and maths and english");
                    }
                  else
                   {
                     System.out.println("passed in three subject physics and hindi and english");
                     System.out.println("passed in two  subject chemistry  and maths");
                   }
                }  
           }/*m*/
           else
            {
              if(h<33)
                {  
                   if(e<33)
                    {
                      System.out.println("passed in two  subject physics  and  maths");
                      System.out.println("fail in three subject chemistry and english and hindi"); 
                    }
                   else
                    {
                      System.out.println("passed in three subject physics and maths and english");
                      System.out.println("fail in two subject chemistry and hindi"); 
                    }
               
                }
              else 
               {
                 if(e<33)
                  {
                    System.out.println("passed in three subject physics and maths and hindi");
                    System.out.println("fail in two subject chemistry and english");
                  }
                 else
                  {
                     System.out.println("passed in four subject physics and maths and hindi and english");
                     System.out.println("fail in one subject chemistry"); 
                  }
               }
          }
       }/*c*/
         
       else
           {
             if(m<33)
               { 
                 if(h<33)
                   {  
                      if(e<33)
                         {
                           System.out.println("pass in two sub phy and chem");
                           System.out.println("fail in three subject  and maths and english and hindi");
                         }
                     else
                       {
                         System.out.println("passed in two  subject chemistry and physics  and  english");
                         System.out.println("fail in three subject  maths and hindi");
                       }
                   }   
                 else
                   {
                     if(e<33) 
                      {
                        System.out.println("passed in three  subject physics,chemistry,hindi");
                        System.out.println("fail in two sub  maths and English"); 
                      }
                     else
                      {
                        System.out.println("passed in Four subject english, chemistry and hindi and english");
                        System.out.println("fail in one  subject   maths");
                      }
                    }
             }
            else
             {
              if(h<33)
                  { 
                    if(e<33)  
                       {
                         System.out.println("pass in three subject physics, chemistry and maths ");
                         System.out.println("fail in two subject  english and hindi");
                       }
                          else
                            {
                              System.out.println("passed in four sub physics, chemistry and maths and english");
                              System.out.println("fail in one  subject   hindi");
                            }
                  }
                     else
                      {
                          if(e<33)
                           { 
                             System.out.println("passed in Four subject physics chemistry and maths and hindi");
                             System.out.println("fail in one  subject   english"); 
                           }
                          else
                            {                                  
                              System.out.println("pass in all subjects");  
                              int total=p+c+m+h+e;
                              double per=total/5.0;
                              System.out.println("Total marks="+total);
                              System.out.println("Total Percentage="+per);
                              if(per<0)  
                                    System.out.println("Invalid percentage");               
                                 else
                                   {
                                     if(per>100) 
                                                                                     
                                     else
                                      { 
                                        if(per>60)                                        
                                          System.out.println("pass by 1st division");
                                         else  
                                           {
                                             if(per>45)
                                             System.out.println("pass by 2nd division");
                                           else
                                           {
                                             if(per>=33)
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
 } 


