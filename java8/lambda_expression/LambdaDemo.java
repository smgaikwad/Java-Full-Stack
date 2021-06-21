package java8.lambda_expression;
import java.util.function.*;
public class LambdaDemo {
    public static void main(String[] args) {

        Function<Integer,Integer> f = i->i*i;
//        () -> System.out.println("Hello lambda Expression");
        Integer a  = f.apply(10);
        System.out.println(a);
        System.out.println(f.apply(20));


    }
}