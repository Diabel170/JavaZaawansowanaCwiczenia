package lambdy.błędyNaLambdach;

import java.util.function.BiConsumer;

public class Main {

    public static void main(String[] args) {

        System.out.println(sum("Świetne Lambdy", Integer::sum)); //Integer - składnik aplikacji, na której się powołujemy, w której mieści się metoda sum. Może być również obiekt. Sum jest statyczny = wywołujemy go na rzecz klasy, a nie obiektu
        System.out.println(sum("Świetne Lambdy", Main::doubleSum ));
        System.out.println(sum("Świetne Lambdy", KingSumable::doubleSumInterfaceObject ));

        Main m = new Main();
        System.out.println(sum("Świetne Lambdy", m::doubleSumObiekt ));


        calc(5, 2, (integer, integer2) -> {
            try {

                System.out.println(integer/integer2);
            } catch (Exception e){
                System.out.println("Błąd" + e.getMessage().toString());
            }
        });

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


    public static void calc(int i, int j, BiConsumer<Integer, Integer> biConsumer){
        System.out.println("Dzielenie");
            biConsumer.accept(i, j);

    }

}
