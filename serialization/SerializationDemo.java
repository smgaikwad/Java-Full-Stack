package serialization;

import java.io.*;

class Dog implements Serializable{
    String name;
    static String color;

    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}


public class SerializationDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Dog moti = new Dog("Moti", "Black");
        Dog raj = new Dog("Raj", "white");
        // serialization
        FileOutputStream fos = new FileOutputStream("dog1.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(moti);
        oos.writeObject(raj);

        //deserialization
        FileInputStream fis = new FileInputStream("dog1.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Dog dog1 = (Dog)ois.readObject();
        Dog dog2 = (Dog)ois.readObject();

        System.out.println(dog1 + " " + dog2 + "" + moti);

    }
}
