package java8.interfaces;

import java.util.ArrayList;
import java.util.stream.Stream;

interface Printable{
    //void show();
    default void print(){
        System.out.println("I am default interface method...");
    }
}



public class InterfaceDemoApp implements Printable {
    public static void main(String[] args) {
        InterfaceDemoApp ida = new InterfaceDemoApp();
        ida.print();

        ArrayList<Integer> values = new ArrayList<>();
        values.add(10);
        values.add(20);
        values.add(30);
        values.add(40);
        values.add(50);
        values.add(60);
        values.add(70);
        Stream<Integer> s = values.stream();
        s.forEach(System.out::println);
    }
}