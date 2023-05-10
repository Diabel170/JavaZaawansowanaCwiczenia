package map;

import java.util.HashMap;
import java.util.Map;

public class MainHashMap {
    public static void main(String[] args) {

        Map<Integer, String> integerStringMap = new HashMap<>();
        integerStringMap.put(123, "Hash mapa rządzi");
        integerStringMap.put(10, "Linked mapa rządzi");
        integerStringMap.put(220, "Tree mapa rządzi");
        integerStringMap.put(1, "Mapa nie rządzi");
        integerStringMap.put(10000, "Mapa mapa rządzi");
        integerStringMap.forEach(((integer, s) -> {
            System.out.println(integer + " " + s); //kolkejności kluczy nie są istotne
        }));
        System.out.println(integerStringMap.size());
        System.out.println(integerStringMap.keySet());
    }
}
