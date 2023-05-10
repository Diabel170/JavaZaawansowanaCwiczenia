package zaawansowanegeneryki.wildcards.dzikakartaodgory;

import java.util.ArrayList;
import java.util.List;

public class Enclosure<T extends Animal> { //będziemy mieli dostęp do metod Animal. Możemy robić polimorficznie operacje na Animal, nie martwiąc się czy trafił się Elephant czy Giraffe
                                            //OGRANICZENIE Z GÓRY - MAM WSZYSTKIO TO CO DZIEDZICZY Z ANIMAL, dopuszczam to, co jest bardziej precyzjne
    private List<T> t = new ArrayList<>();

    public List<T> getT() { //ZESTAW INSTRUKCJI Z T TO ZESTAW Z ANIMAL
        return this.t;
    }

    public void add(T t1) {
        t.add(t1);
    }
}
