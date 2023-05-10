package set;

import zaawansowanegeneryki.wildcards.dzikakartaoddołu.Elephant;

import java.util.Comparator;
import java.util.TreeSet;

public class MainTreeSet {
    /*W konstruktorze wskazujesz Comparator, który sortuje. Używany by określić kolejność tego zestawu, a jak nie to będzie to naturalne sortowanie. Wkładane elementy przechodzą jeszcze sortowanie. Więc nie zachowuje się kolejność wkładania jak w Linked.*/
    public static void main(String[] args) {
        TreeSet<Elephant> stringTreeSet = new TreeSet<>((Comparator.comparing(o -> o.name))); //jakbym cofnął do wcześniejszej lambdy i wstawił po return "-" to by wyliczyło od tyłu

        stringTreeSet.add(new Elephant("Arek"));
        stringTreeSet.add(new Elephant("Zosia"));
        stringTreeSet.add(new Elephant("Ania"));
        stringTreeSet.add(new Elephant("Basia"));
        stringTreeSet.add(new Elephant("Czarek"));
        stringTreeSet.add(new Elephant("Darek"));
        stringTreeSet.forEach(elephant -> {
            System.out.println(elephant.name);
        });


    }
}
