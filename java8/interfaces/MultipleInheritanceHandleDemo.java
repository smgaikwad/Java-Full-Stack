package java8.interfaces;
interface I1{
    default void print(){
        System.out.println("print() method of I1 interface is called... :)");
    }
}

interface I2{
    default void print(){
        System.out.println("print() method of I2 interface is called... :)");
    }

    static void print(String string){
        System.out.println(string);
    }
}

class Test implements I1,I2{
    @Override
    public void print(){
        I1.super.print();
        I2.super.print();
        System.out.println("print() method of class Test is called... :)");
    }
}

public class MultipleInheritanceHandleDemo {
    public static void main(String[] args) {
        Test test = new Test();
        test.print();

        I2.print("Sooraj Gaikwad");
    }
}
