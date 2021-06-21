package java8.interfaces;

@FunctionalInterface
interface Flexible{
    public int add(int a, int b);
}
interface Factorial{
    public int fact(int n);
}
public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        Flexible flexible = (a,b)-> a+b;
        System.out.println(flexible.add(122,344));
        System.out.println(flexible.add(132,334));
        System.out.println(flexible.add(552,345));

        Factorial factorial = n -> {
            int fact=1;
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
            return fact;
        };

        System.out.println(factorial.fact(5));
        System.out.println(factorial.fact(15));
        System.out.println(factorial.fact(8));
    }
}
