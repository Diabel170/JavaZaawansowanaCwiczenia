package lambdy.lambdaPrawdziwaARGiWYN;

import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        System.out.println(add("Extra Lambdy", i -> i + i));
    }
//Wszystko robimy tak jak wcześniej, ale teraz add zwraca wynik. Wykorzystujemy go przekazując do dalej :]
//można to skrócic alt insert na return

    public static Integer add(String s, JustAddable justAddable) {
        System.out.println(s);
        return justAddable.add(3);

    }
}
