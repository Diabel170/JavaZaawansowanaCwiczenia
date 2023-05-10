package map;

import java.util.LinkedHashMap;

public class MainLinkedHashMap {
    public static void main(String[] args) {

        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(123, "Puszek");
        map.put(222, "Łatka");
        map.put(10, "Dziura");
        System.out.println(map.size());
        System.out.println(map.keySet());
        System.out.println(map.values());
        map.forEach((integer, s) -> {
            System.out.println(integer + " " + s);
        });
    }
}
