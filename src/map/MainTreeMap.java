package map;

import java.util.Map;
import java.util.TreeMap;

public class MainTreeMap {
    public static void main(String[] args) {

        Map<Integer, String> cats = new TreeMap<>((o1, o2) -> {
            return o1*o1-o2*o2;
        });
        cats.put(123, "Puszek");
        cats.put(222, "Łatka");
        cats.put(10, "Dziura");
        cats.put(-10, "Dołek");

        System.out.println(cats.size());
        System.out.println(cats.keySet());
        System.out.println(cats.values());
        cats.forEach((key, name) -> {
            System.out.println(key + " " + name);
        });
    }
}
