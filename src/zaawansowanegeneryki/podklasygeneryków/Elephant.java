package zaawansowanegeneryki.podklasygeneryków;

public class Elephant extends Animal {
    public static final String MEAL_DEFAULT = "wodę"; //Do pól statycznych możemy odnosić się za pomocą zarówno nazwy klasy, jak i obiektów tej klasy, ale tego samego nie można powiedzieć o zmiennych niestatycznych – do takich zmiennych możemy odnosić się jedynie przez obiekty klasy
    public static final String TYPE_NAME_DEFAULT = "Słoń";

    public Elephant(String name) {
        super(name, MEAL_DEFAULT);
    }

    @Override
    public void eat() {
        System.out.println(TYPE_NAME_DEFAULT + " " + name + " pije " + meal);
        //super.eat(); CRTL+O; jeżeli chcemy by wykonał się kod w animal a następnie twój kod to zostawiamy, ale nie chcemy brać pod uwagę kodu z animal
        //My robimy tak, że kompilator najpierw sprawdzi w Elephant czy jest metoda animal - w naszym przypadku eat - dla innych zwierząt nie znajdzie i weźmie tę z animal, a tu znajdzie i te użyje
    }
//polimorfizm dynamiczny - czyli "ten za pomocą przesłaniania", przesłania się metody, które są w klasach nadrzędnych, czyli te co rozszerzamy; robi się też statyczny
    public void giveMeLuck(){
        System.out.println("Życzę szczęścia!");
    }
}
