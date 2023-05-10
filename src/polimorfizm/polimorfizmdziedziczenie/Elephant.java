package polimorfizm.polimorfizmdziedziczenie;

public class Elephant extends Animal {
    public static final String MEAL_DEFAULT = " pije wodę"; //Do pól statycznych możemy odnosić się za pomocą zarówno nazwy klasy, jak i obiektów tej klasy, ale tego samego nie można powiedzieć o zmiennych niestatycznych – do takich zmiennych możemy odnosić się jedynie przez obiekty klasy
    public static final String TYPE_NAME_DEFAULT = "Słoń ";

    public Elephant(String name) {
        super(TYPE_NAME_DEFAULT + name, MEAL_DEFAULT);
    }

    //polimorfizm dynamiczny - czyli "ten za pomocą przesłaniania", przesłania się metody, które są w klasach nadrzędnych, czyli te co rozszerzamy; robi się też statyczny
}
