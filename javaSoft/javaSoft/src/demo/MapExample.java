/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo;

import java.util.HashMap;

/**
 *
 * @author T460
 */
public class MapExample {
    public static void main(String[] args) {
        
       HashMap<String ,Integer> courses=new HashMap<>();
       courses.put("core java", 4000);
       courses.put("Basic pyton",3500);
       courses.put("Spring",8000);
       courses.put("Android",4000);
       courses.put("Android", 6000);
       
        System.out.println(courses);
        
       courses.forEach((e1,e2)->{
           System.out.println(e1+"=>"+e2);
           
       });
       courses.forEach((key,value)->{
             System.out.println(key+" => "+value);
       });
       //entry set
       //key set
       
        System.out.println(courses.get("core java"));
       
       
       
       
    }
    
}
