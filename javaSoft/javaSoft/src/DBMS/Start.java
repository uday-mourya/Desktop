/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DBMS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author T460
 */
public class Start {
    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to student Management app");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        while(true){
            System.out.println("Press 1 to add student");
            System.out.println("Press 2 to delete student");
            System.out.println("Press 3 to display student");
            System.out.println("Press 4 to update student");
            System.out.println("press 5 to exit");
            int c=Integer.parseInt(br.readLine());
            if(c==1){
                //add student
                System.out.println("Enter name : ");
                String name=br.readLine();
                
                System.out.println("Enter user phone : ");
                String phone=br.readLine();
                
                System.out.println("Enter user city : ");
                String city=br.readLine();
                
                //create student object to store student
                Student st=new Student(name,city,phone);
                boolean answer=StudentDAO.insertStudentToDB(st);
                if(answer)
                {    
                    System.out.println("student is added successfully");
                }else{
                    System.out.println("Something went wrong");
                }
                
            }else if(c==2){
                //delete Student
                System.out.println("Enter Student id to delete: ");
                int userId=Integer.parseInt(br.readLine());
                boolean b=StudentDAO.deleteStudent(userId);
                if(b){
                    System.out.println("deleted");
                }else{
                    System.out.println("something went wrong");
                }
            }else if(c==3){
                StudentDAO.showALLStudents();
               //  
            }else if(c==4){
               System.out.println("Enter the id to update");
               int id=Integer.parseInt(br.readLine());
               System.out.println("Enter the name");
               String name=br.readLine();
               System.out.println("Enter the phone");
               String phone =br.readLine();
               System.out.println("Enter the city");
               String city=br.readLine();
               Student st=new Student(id,name,city,phone);
               boolean b=StudentDAO.updateStudent(st);
               if(b){
               System.out.println("record updated successfully");
               }else{
               System.out.println("something went wrong");
               }
            }else if(c==5){
                break;
            }
        }
        System.out.println("thank you for using my app  bye");
    }
    
}
