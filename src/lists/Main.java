package lists;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
       ArrayList<Integer> integerArrayList = new ArrayList<>(); //mają inne zestawy instrukcji
        integers.add(1);
        integers.add(4);
        integers.add(8);
       integers.add(0, 100); //wstawia element i przesuwa elementy z tej pozycji na kolejne elementy w prawo!

        for (int i = 0; i < integers.size(); i++) {
            System.out.println(integers.get(i));
        }
    }
}
