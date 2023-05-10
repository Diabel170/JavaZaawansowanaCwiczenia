package javaUtilFunctions;

import java.util.function.BiFunction;

public class JUFBiFunction {
    public static void main(String[] args) {

        System.out.println(sum(20, 4, (integer, integer2) -> integer/integer2));
//        System.out.println( sum((integer, integer2) -> integer/integer2));
    }

    public static Integer sum(int i, int j,BiFunction<Integer, Integer, Integer> biFunction){
        return biFunction.apply(i, j);
    }
//    public static Integer sum(BiFunction<Integer, Integer, Integer> biFunction){
//        return biFunction.apply(30, 5);
//    }
}
