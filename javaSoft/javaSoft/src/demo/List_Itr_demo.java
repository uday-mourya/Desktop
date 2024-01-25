/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author T460
 */
public class List_Itr_demo {
    public static void main(String[] args) {
       List l=new ArrayList();
        l.add(10);
        l.add("deepak");
        l.add("rahul");
        ListIterator li=l.listIterator();
      //  while(li.hasNext()){
      //      System.out.println(li.next());
      // }
     
      li.next();
      li.next();
        while(li.hasPrevious()){
            System.out.println(li.previous()); 
        }
      //  li.add(100);
        li.set(200);
        System.out.println(l);
    }
}
