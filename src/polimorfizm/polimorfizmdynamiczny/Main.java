package polimorfizm.polimorfizmdynamiczny;

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
        animals.add(new Elephant("Edward"));
        animals.add(new Elephant("Piotr"));
        animals.add(new Giraffe("Kasia"));
        animals.add(new Shark("Tomek"));


        animals.forEach(animal -> {
            animal.eat();
            if (animal instanceof Elephant){ //gdyby nie to, to metoda giveMeLuck by nie zadziałała. Sprawdzam czy obiekt jest instancją Elephant - tak.
                ((Elephant) animal).giveMeLuck();
                //
            }
        });


    }
}