package set;

import java.util.HashSet;
import java.util.Set;

public class MainHashSet {
    public static void main(String[] args) {
        Set<Integer> integers = new HashSet<>();
        integers.add(3);
        integers.add(6);
        integers.add(2);
        integers.add(4);
        integers.add(5);
        integers.add(6);
        integers.add(7);
        integers.add(1);//nie wstawi nowej jedynki
        integers.add(null);
        integers.add(null);//drugiego nulla tez
        for (Integer i:integers
             ) {
            System.out.println(i);
            
        }
    }
}
