package zaawansowanegeneryki.wildcards.dzikakartabezograniczen;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static int countElephatns(List<?> le){
        int counter = 0;
        for (Object a: le){ //musimy posługiwać się objectem jeżeli chcemy używać ? super
            if (a instanceof Elephant){
                ((Elephant)a).giveMeLuck();
                counter+=1;
            }
        }
        return counter;
    }


     // jak wrzucimy listę elephantów, to lista animal przestanie działać, a jak mamy listę animalsow, to z kolei lista elephantów przestanie działać
    public static void main(String[] args) {
//POLIMORFIZM STATYCZNY: TEN PRZEZ PRZECIĄŻANIE METOD O TEJ SAMEJ NAZWIE, ALE RÓŻNIĄCY SIĘ W SYGNATURZE LISTĄ ARGUMENTÓW

        //Koncepcja od ogólu do szczegółu

        //Animal animal = new Animal(); - nie można, abstrakcja, obejście - klasa anonimowa:
      //  Animal animal = new Animal("Tygrys", "mięso"){}; //klamra - podobna struktura do tego jakbym deklarował nowe zwierze    JAKBY NIE BYŁO EAT W ANIMAL, TO KLAMRA BY SIĘ ZAŚWIECIŁA
                                                                    //klasa anonimowa - nie można tak


        //prosimy klienta o listę zwierząt
        //Chcemy miec listę zwierząt różnego typu. Chcemy przetworzyć listę podobnych bytów, by każde z nich wykonało coś na swój sposób. Rzeczywiste wykonanie kodu ma zależeć od rzeczywistego typu,a nie zadeklarowanego
        //Zadeklarowaliśmy listę List,a zainicjowaliśmy ją listą ArrayList<typ dekl><typRzeczywisty>. Polimorfizm - przetwarzanie podobnych zestawów danych, jest ich dużo, różne typy - chcemy załatwiać to za jednym zamachem. Ich różnice są zdefiniowane w tych zestawach, ich odpowiedzialność żeby rozwiązać nasz problem.
        //Polimorfizm - wielopostaciowość - najprościej przez dziedziczenie
        //chcemy przechowywać wszystkie zwierzęta
        List<Animal> animals = new ArrayList<>();//PODSUMOWANIE:
        Elephant zosia = new Elephant("zosia");
        Animal benio = new Giraffe("benio");
//SŁONIK TESTER POTRZEBNY DO WILDCARDSÓW. POTRZEBUJEMY DO NAUKI 2 RÓŻNYCH LIST
        List<Elephant> elephantList = new ArrayList<>();
        elephantList.add(new Elephant("Słoń Tester"));
        //WILDCARDS OD DOŁU - TE Z UŻYCIEM ? SUPER
        List<Giraffe> giraffes = new ArrayList<>();
        giraffes.add(new Giraffe("Żyrafa Tester"));

        animals.add(new Elephant("Edward"));
        animals.add(new Elephant("Piotr"));                         //mamy liste zwierząt - typ zadeklarowany - zestaw instrukcji Animal, a ich rzeczywiste wykorzystanie
        animals.add(new Elephant("Tom"));                           // z ELEPHANT, GIRAFFE ITD.
        animals.add(new Elephant("Krzyś"));                         //W czasie kompilacji programu, gdy go piszesz, wiadomo, że wykona się ta konkretna metoda eat(int numberOfMeals) - statyczny
        animals.add(new Giraffe("Kasia"));                          // dynamicznie - w momencie rzeczywistego działania programu jest stwierdzane, który eat zostanie wykonany - czy Mniam czy z końcowego typu - żyrafa, słoń.
        animals.add(new Shark("Tomek"));                            //Najpierw sprawdzi w Elephantach itd. czy jest tam metoda eat(int numberOfMeals), a że nie ma, to weźmie z nadklasy Animals
        animals.add(new Shark("Zbyszek"));                          //I z niej przekierowuje na eat i znowu od góry szuka rzeczywistego typu
        animals.add(new Shark("Paweł"));                            //DYNAMICZNE - PRZESŁANIANIE, STATYCZNE - PRZECIĄŻANIE
        List<Object> objects = new ArrayList<>();
        countElephatns(objects); //pójdzie, bo elephant dziedziczy z objects
        System.out.println("LICZYMY ZWIERZACZKI, KTÓRE SĄ SŁONIKIEM PRZEZ METODĘ SZCZĘŚCIA");
        System.out.println(countElephatns(animals));
        System.out.println("TUTAJ W METODZIE WSTUKUJEMY JUŻ Z WILDCARDĄ NASZĄ elephantList, gdzie jest SŁONIK TESTER");
        System.out.println(countElephatns(elephantList));
//        countElephatns(elephantList); - nie pójdzie, bo to ma być lista<Animal>, a nie List<Elephant>
        System.out.println("RAZEM:");
        System.out.println(countElephatns(animals) + countElephatns(elephantList));
        System.out.println(countElephatns(giraffes)); // nie można. Elephant nie dziedziczy z giraffes// Z WILDACARD BEZ OGRANICZEŃ JUŻ DZIAŁA
        //chcemy raz odpalić program, aby np. nakarmić zwierzęta 5 razy
        animals.forEach(animal -> {
            animal.eat(5);


            if (animal instanceof Elephant) { //gdyby nie to, to metoda giveMeLuck by nie zadziałała. Sprawdzam czy obiekt jest instancją Elephant - tak.
                ((Elephant) animal).giveMeLuck();
                //
            }

        });
        //GENERYKI:
//            ((Giraffe) animal).eat(); - TO ZWRÓCI BŁĄD - CLASSCASTEXCEPTION - animal jest słoniem, zrzutujemy to na żyrafę, ale słoń nie ma zestawu instrukcji żyrafy - metody eat();
        Enclosure<Elephant> elephantEnclosure = new Enclosure<>();
        elephantEnclosure.add(new Elephant("Rafał"));
        System.out.println(elephantEnclosure.getT());
        //PIERWSZ KORZYŚĆ - METODY SŁONIKA BEZ KONIECZNOŚCI RZUTOWANIA TAKIEJ KLASY
       // elephantWybieg.getT().giveMeLuck();
        Enclosure<Elephant> elephantEnclosure1 = new Enclosure<>();
        elephantEnclosure1.add(new Elephant("Henio"));
        elephantEnclosure1.add(new Elephant("Jasio"));
        elephantEnclosure1.add(new Elephant("Tomek"));
        System.out.println(elephantEnclosure1.getT());

        compare(elephantEnclosure, elephantEnclosure1);

        Enclosure<Giraffe> giraffeEnclosure = new Enclosure<>();
        giraffeEnclosure.add(new Giraffe("Kasia"));
        System.out.println(giraffeEnclosure.getT());

       // compare(elephantWybieg, giraffeWybieg); //niedobrze, jest inny typ generyczny, więc trzeba wskazać jawnie, że chodzi nam o np. słonika. To dwa różne wybiegi - dlatego
        // rozwijamy naszą metodę compare o extends Animal

        FavouriteNumber<Integer> integerFavouriteNumber = new FavouriteNumber<Integer>() {
            @Override
            public void printFavouriteNumber(Integer integer)//JUZ JEST INTEGER
            {
                System.out.println("Mój ulubiony to: " + integer.toString());
                                                //używamy klasy abstrakcyjnej by zobaczyć jak kompilator rozumie to, który będzie zamieniać to na kod javowy

            }
        };
        //INTERFEJSY GENERYCZNE:
        integerFavouriteNumber.printFavouriteNumber(6);
        NicePrinter<Short> nicePrinter = new NicePrinter<>();
        short s = 5;
        nicePrinter.printFavouriteNumber(s); //short leci do NicePrinter, przekazuje sie do FavouriteNumber, i wraca pod postaćia T i wykonuje się w metodzie
        System.out.println(nicePrinter.isDifferent(benio, zosia)); //PORÓWNUJE ANIMAL- działa dość zwinnie; można obsługiwać troszkę szersze spektrum klas


//        DZIEDZICZENIE GENERYKÓW:
        Object o = new Object();
        String string = "tekst"; //s dziedziczy po o; wszystkie klasy dziedziczą po object
        o = string; //polimorficznie nie będę mógł na o wywołać metod string, ale mogę zrzutować
//        ((String)o). - mamy metody Stringa
//możemy przypisać do siebie metody
        Enclosure<Elephant> slonie = new Enclosure<>();
        Enclosure<Animal> zwierzeta = new Enclosure<>();
        //nie mozna zwierzeta = slonie - TRZEBA UŻYĆ PODTYPÓW Z DZIKĄ KARTĄ - DOŚĆ ZAAWANSOWANA TECHNIKA

        Enclosure<? extends Elephant> slonieOK = new Enclosure<>();
        Enclosure<? extends Animal> zwierzetaOK = new Enclosure<>();
        zwierzetaOK = slonieOK ; // elephant jest podtypem animal, więc ok //póki są same elephanty w animalach gitara, ale my tylko sie powolujemy na typ zwracany i type erasure może byc object, ale w drugą stronę na lisćie parametrów nie da rady
        slonieOK.getT();
        zwierzetaOK.getT(); //WYTRACENIE INFORMACJI - TAM JEST CAPTURE OF ? EXTENDS ANIMAL
      //  DLACZEGO POLIMORFICZNE GENERYKI NIE WSPIERAJĄ PODTYPÓW:

        List<Long> longs = new ArrayList<Long>();
        longs.add(Long.valueOf(12));
       // List<Number> numbers = longs;//dlaczego? - Bo jakby wziąć number i dodać coś to program by się zatrzymał w czasie kompilowania, nie wolno subtypów; z wildcarda na górze można - one są obsługiwane jako typ T w enclosure - jest używany przy gecie jako lista T - czyli typ zwracany, jest type erasure i get zwraca liste obiektow

         // zwierzetaOK.add();//nigdy nie zadziała: on będzie chciał typecheck, a w metodzie add ma type erasure, może wszystko, więc nie wygeneruje wszystkie add

//        zwierzeta = slonie; nielegalne, i dobrze! Jeżeli byśmy podmieniali Animal i Elephant to łamali byśmy dobre praktyki; nie można przypisać do generyka co ma klase bardziej ogólną
//        do generyka co ma klase bardziej szczególną, bo to dwa różne typy. MOŻEMY TO ZAŁATWIĆ PODKLASAMI GENERYKÓW
//        Integer i = 5;  } DOKŁADNIE TAKA SAMA SYTUACJA
//        string = i;     }

        o = slonie; //ENCLOSURE jest związany z Objects, bo każda klasa jest, ale nie jest z sąsiadującymi klasami!!!!!!!


        //PODKLASY GENERYKÓW
        Enclosure<Elephant> wybiegSloni = new Enclosure<>();
        ModernEnclosure<Elephant, Animal> wybiegZwierzat = new ModernEnclosure<>();
      //  wybiegZwierzat = wybiegSloni; typ bardziej ogolny i typ bardziej doprecyzowany; nie można
        wybiegSloni = wybiegZwierzat;


        //dlaczego nie można generycznej tablicy. Kolekcje to struktury typów prostych - tam jest oklasowane, wszystko to obiekty. Tablice były modne, kiedy java była młoda,
        // one są inaczej przechowywane w pamięci. Typy elementów w tablicach są przechowywane w JVM razem z elementami, np. Integer i 7. Element i jego wartość w pamięci.
        //Więc jeżeli w czasie działania programu, nastąpi konflikt takich typów poleci ArrayStoreException, a TYPE ERASURE wyczyszcza pamięć z typów w czasie kompilacji, a w czasie działania
        // programu nie będzie miał podstaw do odmówienia wykonania takiej instrukcji - dlatego zablokowane jest robienie takich struktur.

//        List<Integer>[] integerList = new List<>[8];
//        Object[] objects1 = integerList;
//        List<Double> doubleList = new ArrayList<>();
//        doubleList.add(Double.valueOf(3.14));
//        objects1[0] = doubleList;


    }







    static<T extends Animal> int compare (Enclosure<T> t1, Enclosure<T> t2){ //main jest statyczny, w obręcie jego klasy możemy tylko statyczne metody
       return t1.getT().size() - t2.getT().size();
    }
}