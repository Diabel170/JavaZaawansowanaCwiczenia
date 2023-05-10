package set;

import zaawansowanegeneryki.wildcards.dzikakartaoddołu.Elephant;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class MainLinkedHaszSet {
    public static void main(String[] args) {

        LinkedHashSet<Elephant> set = new LinkedHashSet<>();
        set.add(new Elephant("Jeden"));
        set.add(new Elephant("Dwa"));
        set.add(new Elephant("Jeden"));
        set.add(new Elephant("Trzy"));
        set.add(new Elephant("Jeden"));
        set.add(new Elephant("Cztery"));

        for (Elephant elephant : set) {
            System.out.println(elephant.name);
        }
    }
    /*Jest podobny do LinkedArrayListy. Na podobnej zasadzie w stosunku do HashSet. Ma informacje o kolejności. TA KLASA NIE JEST SYNCHRONIZOWANA – NIE MOŻNA PRZETWARZAĆ - FOR EACH, STRUMIEŃ itp. – wyskoczy błąd. Zachowuje kolejność wkładania. */
}
