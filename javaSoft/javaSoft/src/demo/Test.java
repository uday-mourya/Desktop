/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo;

import java.util.Enumeration;
import java.util.Vector;

public class Test {
    public static void main(String[] args) {
        Vector<Integer> v=new Vector<>();
        v.add(10);
        v.add(56);
        v.add(10);
        v.add(56);
//        v.add("");

        

       // System.out.println(v);
        Enumeration e=v.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }  
    }
    
}
// Iterator -
/* 1.we can get Iterator cursor by iterator() method 
   2.Ierator cusor  can be used with any collection object
   3.Iterator methods are -
     hasNext(),next(),remove()
   4.in forward direction we will retrive objects
   5.we can read,retrive and revome the elements

*/
//ListIterator -
/* 1.we can get ListIterator() by list iterator method
   2.List Iterator cursor can be used with only with List implemented classes
     i.e. Arraylist LinkedList,Vector,Stack
   3.ListIterator methods are 
   has next(),next(),hasPrevious(),previous(),remove(),set()
   4.in both forward and backward direction
   5.we can read remove replace  and add the elements
*/