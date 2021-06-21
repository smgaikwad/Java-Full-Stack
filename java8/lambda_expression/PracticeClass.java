package java8.lambda_expression;
interface A{
    void show(int i, int j);
}
public class PracticeClass{
    public static void main(String[] args) {

        A a = (i,j)-> {
            System.out.println("hello: "+i+"\n" + "hello: "+j);
        };

        a.show(5,6);
    }
}
