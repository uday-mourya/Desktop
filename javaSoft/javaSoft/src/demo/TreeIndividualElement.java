
package demo;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Spliterator;
import java.util.TreeSet;

class MyCompare implements java.util.Comparator {
    TreeSet ts;
    MyCompare(TreeSet ts) {
        this.ts = ts;
    }
    @Override
    public int compare(Object o1, Object o2) {
        // Custom comparison logic goes here
        Integer i1 = (Integer) o1;
        Integer i2 = (Integer) o2;

        if (i1.equals(i2))
            return 0;
        else if (i1 > i2)
            return 1;
        else
            return -1;
    }
}

public class TreeIndividualElement {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet(new MyCompare(new TreeSet()));
        ts.add(67);
        ts.add(41);
        ts.add(67);
        ts.add(56);
        ts.add(34);
        ts.add(65);
        System.out.println("Sorted Treeset: "+ts);
        System.out.println("Sorted TreeCeiling: " + ts.ceiling(40));
        System.out.println("Sorted Treefirst " + ts.first());
        System.out.println("Sorted Treetail " + ts.tailSet(41) );
        System.out.println("Sorted Treetail2" + ts.tailSet(41,true));
        System.out.println("Sorted Treehead " + ts.headSet(41) );
        System.out.println("Sorted Treehead2 "+ts.headSet(41,true));
        System.out.println("Sorted Treeiterator " + ts.spliterator());
        Spliterator spl=ts.spliterator();
        System.out.println("spliterator "+spl.characteristics());
        System.out.println(""+spl.estimateSize());
        System.out.println("Sorted TreeComparator " + ts.comparator());
        System.out.println("Sorted TreeComparator "+ts.floor(67));
        System.out.println("Sorted TreeHigher "+ts.higher(41));
        System.out.println("Sorted Treelast"+ts.last());
        System.out.println("Sorted TreeLower"+ts.lower(56));
       
        Iterator it1=ts.iterator();
        while(it1.hasNext()){
            System.out.println("Iterator :"+it1.next());
        }
        System.out.println("Sorted Subset "+ts.subSet(41, 67));
        System.out.println("sorted Subset "+ts.subSet(67, true, 41, true));
        
         System.out.println("pollFirst: "+ts.pollFirst());
        System.out.println("pollFirst: "+ts.pollLast());
        
        System.out.println("TreeSet: "+ts.size());
        
        
        // Find a specific element
        System.out.println("enter element to find");
        Scanner sc=new Scanner(System.in);
        int elementToFind = sc.nextInt();
        if (ts.contains(elementToFind)) {
            System.out.println("Element " + elementToFind + " found in TreeSet.");
        } else {
            System.out.println("Element " + elementToFind + " not found in TreeSet.");
        }
    }
}

