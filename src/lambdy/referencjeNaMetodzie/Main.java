package lambdy.referencjeNaMetodzie;

public class Main {

    public static void main(String[] args) {

        System.out.println(sum("Świetne Lambdy", Integer::sum)); //Integer - składnik aplikacji, na której się powołujemy, w której mieści się metoda sum. Może być również obiekt. Sum jest statyczny = wywołujemy go na rzecz klasy, a nie obiektu
        System.out.println(sum("Świetne Lambdy", Main::doubleSum ));
        System.out.println(sum("Świetne Lambdy", KingSumable::doubleSumInterfaceObject ));

        Main m = new Main();
        System.out.println(sum("Świetne Lambdy", m::doubleSumObiekt ));

    }
public static Integer sum(String s, KingSumable kingSumable){
        System.out.println(s);
        return kingSumable.sum(2, 3);

    }

    public static Integer doubleSum(int i, int j){
        return i+j+i+j;
    }
    public Integer doubleSumObiekt(int i, int j){
        return i+j+i+j;
    }
}
