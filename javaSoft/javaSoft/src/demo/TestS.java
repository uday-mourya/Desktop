/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo;



import java.util.TreeSet;
import java.util.Comparator;
import java.util.Objects;

class MyCompare implements Comparator {
    TreeSet ts;

    MyCompare(TreeSet ts) {
        this.ts = ts;
    }

    @Override
    public int compare(Object o1, Object o2) {
        // Custom comparison logic goes here
        Integer i1 = (Integer)o1;
        Integer i2 = (Integer)o2;
        
        if(Objects.equals(i1, i2))
            return 0;
        else if(i1>i2)
            return -1;
        else 
            return 1;
        
    }
}

public class TestS {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet(new MyCompare(new TreeSet()));
        ts.add(67);
        ts.add(41);
        ts.add(67);
        ts.add(56);
        ts.add(34);
        ts.add(65);

        System.out.println("Sorted TreeSet: " + ts);
    }
}
