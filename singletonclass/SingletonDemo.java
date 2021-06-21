package singletonclass;

class SingletonClass {
    private static SingletonClass object = new SingletonClass();

    private SingletonClass(){

    }

    public static SingletonClass getInstance(){
        return object;
    }
}

public class SingletonDemo{
    public static void main(String[] args) {
//        SingletonClass sc = new SingletonClass();

        SingletonClass sc = SingletonClass.getInstance();

    }
}
