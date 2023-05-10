package polimorfizm.zalozeniapolimorfizmu;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Zoo
        //Zwierzęta:
        //Słoń Edward
        //Słoń Piotr - nowy
        //Żyrafa Kasia
        //Rekin Tomek

        //prosimy klienta o listę zwierząt
        //Chcemy miec listę zwierząt różnego typu. Chcemy przetworzyć listę podobnych bytów, by każde z nich wykonało coś na swój sposób. Rzeczywiste wykonanie kodu ma zależeć od rzeczywistego typu,a nie zadeklarowanego
        //Zadeklarowaliśmy listę List,a zainicjowaliśmy ją listą ArrayList<typ dekl><typRzeczywisty>. Polimorfizm - przetwarzanie podobnych zestawów danych, jest ich dużo, różne typy - chcemy załatwiać to za jednym zamachem. Ich różnice są zdefiniowane w tych zestawach, ich odpowiedzialność żeby rozwiązać nasz problem.
        //Polimorfizm - wielopostaciowość - najprościej przez dziedziczenie
       //chcemy przechowywać wszystkie zwierzęta
        List<Animal> animals = new ArrayList<>();
        //animals.add(new Elephant("Słoń Edward"));
        animals.add(new Animal("Słoń Piotr"));
       // animals.add(new Giraffe("Żyrafa Kasia"));
        //animals.add(new Shark("Rekin Tomek"));
        animals.forEach(animal -> {
           // System.out.println((animal.name + animal.meal));
        });
        System.out.println("Rekin Tomek je tuńczyka");



    }
}