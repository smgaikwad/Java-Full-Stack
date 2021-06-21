package java11;

import java.util.Scanner;
import java.util.stream.Collectors;

public class StringMethodsDemo {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        System.out.println(str);

        // isBlank()
        System.out.println("".isBlank());
        System.out.println("Sooraj".isBlank());
        System.out.println("    ".isBlank());


        System.out.println();

        //lines()
        "sooraj\ndhiraj\nvaibhav\nnikhil".lines().forEach(System.out::println);


        System.out.println();

        //strip()
        System.out.println("    Sooraj Gaikwad  ".strip());
        System.out.println("    Sooraj Gaikwad  ".stripTrailing());
        System.out.println("    Sooraj Gaikwad  ".strip().stripLeading());

        System.out.println();


        //repeat()
        System.out.println("Soorajj\n".repeat(5));

    }
}
