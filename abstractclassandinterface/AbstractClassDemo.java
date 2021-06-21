package abstractclassandinterface;

import java.util.Scanner;

public class AbstractClassDemo {
    public static void main(String[] args) {
        Animal lion = new Lion();
        lion.sound();
        lion.show();

        Animal cat = new Cat();
        cat.sound();
        cat.show();

        Animal dog = new Dog();
        dog.sound();
        dog.show();
    }
}

    abstract class Animal {
        public abstract void sound();
        public void show(){
            System.out.println("I am an Animal");
        }
    }

    class Dog extends Animal {

        @Override
        public void sound() {
            System.out.println("Woof");
        }
    }

    class Cat extends Animal {

        @Override
        public void sound() {
            System.out.println("Mau");
        }
    }

    class Lion extends Animal {

        @Override
        public void sound() {
            System.out.println("Roar");
        }
    }
