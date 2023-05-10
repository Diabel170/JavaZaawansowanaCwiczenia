package javaUtilFunctions;

import java.util.function.Function;

public class JUFFunction {
    public static void main(String[] args) {


        System.out.println(add(i -> i * i));
    }

    public static Integer add(Function<Integer, Integer> integerFunction){
        return integerFunction.apply(5);
    }
}
