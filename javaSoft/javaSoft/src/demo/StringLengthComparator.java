
package demo;

import java.util.Arrays;
import java.util.Comparator;

public class StringLengthComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        return Integer.compare(s1.length(), s2.length());
    }

    public static void main(String[] args) {
        String[] strings = {"apple", "banana", "kiwi", "orange"};
        Arrays.sort(strings, new StringLengthComparator());

        for (String s : strings) {
            System.out.println(s);
        }
    }
}
