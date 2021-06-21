package java11;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class LocalVariableForLambdaParameterDemo {
    public static void main(String[] args) {
        Predicate<Integer> predicate = (var i) -> i%2 == 0;
        BiFunction<Integer, Integer, Integer> function = (var i, var j)-> i*j;


        System.out.println(predicate.test(10));
        System.out.println(function.apply(10, 20));
    }
}
