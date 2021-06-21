package java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileMethodsDemo {
    public static void main(String[] args) throws IOException {
        //writeString()
        Files.writeString(Path.of("dog1.txt"), "Sooraj gaikwad\nShravan Gidde\nKalyani Atkale!");
        Files.writeString(Path.of("example.txt"), "Sooraj gaikwad\nShravan Gidde\nKalyani Atkale!");

        //readString()
        System.out.println(Files.readString(Path.of("dog1.txt")));

        //isSameFile()
        System.out.println(Files.isSameFile(Path.of("dog1.txt"), Path.of("dog1.txt")));



    }
}
