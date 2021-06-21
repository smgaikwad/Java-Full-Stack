package java8.lambda_expression;
interface Anonymous{
    void print();
}

interface Printable{
    void print();
    void show();
}

public class AnonymousClassDemo {
    public static void main(String[] args) {
        Anonymous anonymous =
                ()->
                System.out.println("I am anonymous class implements Anonymous interface...");

        Printable print = new Printable() {
            @Override
            public void print() {
                System.out.println("called method: print()");
            }

            @Override
            public void show() {
                System.out.println("called method: show()");
            }
        };

        print.print();
        print.show();
        anonymous.print();
    }
}
