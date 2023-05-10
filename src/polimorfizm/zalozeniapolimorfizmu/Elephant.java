package polimorfizm.zalozeniapolimorfizmu;

public class Elephant {
    public String name;
    public static final String meal = "pije wodę"; //Do pól statycznych możemy odnosić się za pomocą zarówno nazwy klasy, jak i obiektów tej klasy, ale tego samego nie można powiedzieć o zmiennych niestatycznych – do takich zmiennych możemy odnosić się jedynie przez obiekty klasy
    public Elephant(String name) {
        this.name = name;
    }
}
