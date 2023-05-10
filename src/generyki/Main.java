package generyki;

import java.util.ArrayList;
import java.util.List;

public class Main {
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

        animals.add(new Elephant("Edward"));
        animals.add(new Elephant("Piotr"));                         //mamy liste zwierząt - typ zadeklarowany - zestaw instrukcji Animal, a ich rzeczywiste wykorzystanie
        animals.add(new Elephant("Tom"));                           // z ELEPHANT, GIRAFFE ITD.
        animals.add(new Elephant("Krzyś"));                         //W czasie kompilacji programu, gdy go piszesz, wiadomo, że wykona się ta konkretna metoda eat(int numberOfMeals) - statyczny
        animals.add(new Giraffe("Kasia"));                          // dynamicznie - w momencie rzeczywistego działania programu jest stwierdzane, który eat zostanie wykonany - czy Mniam czy z końcowego typu - żyrafa, słoń.
        animals.add(new Shark("Tomek"));                            //Najpierw sprawdzi w Elephantach itd. czy jest tam metoda eat(int numberOfMeals), a że nie ma, to weźmie z nadklasy Animals
        animals.add(new Shark("Zbyszek"));                          //I z niej przekierowuje na eat i znowu od góry szuka rzeczywistego typu
        animals.add(new Shark("Paweł"));                            //DYNAMICZNE - PRZESŁANIANIE, STATYCZNE - PRZECIĄŻANIE

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
        Generyk<String> stringGeneryk = new Generyk<>();
        stringGeneryk.set("Jestem generykiem");
        System.out.println(stringGeneryk.getT());
        Generyk<Integer> integerGeneryk = new Generyk<>();
        integerGeneryk.set(123);
        System.out.println(integerGeneryk.getT());
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
        NicePrinter <Short> nicePrinter = new NicePrinter<>();
        short s = 5;
        nicePrinter.printFavouriteNumber(s); //short leci do NicePrinter, przekazuje sie do FavouriteNumber, i wraca pod postaćia T i wykonuje się w metodzie
        System.out.println(nicePrinter.isDifferent(benio, zosia)); //PORÓWNUJE ANIMAL- działa dość zwinnie; można obsługiwać troszkę szersze spektrum klas

    }
}