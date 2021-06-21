package objectcreation;

import java.lang.reflect.Constructor;

public class ObjectCreationApp {
    public static void main(String[] args) {

        //object creation using new keyword.........................
        MyClass m1 = new MyClass();
        System.out.println(m1);

        //object creation using class.newInstance() method............
        try {
            MyClass m2 = MyClass.class.newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }



        // object creation using newInstance() method of Constructor Class............
        try
        {
            Constructor<MyClass> obj = MyClass.class.getConstructor();
            MyClass obj1 = obj.newInstance();
            System.out.println(obj1);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }


    }
}


class MyClass{
    int a = 10;
    int b = 20;

    @Override
    public String toString() {
        return "MyClass{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    public MyClass(){}
}