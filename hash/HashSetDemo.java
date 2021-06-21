package hash;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<String>();

        names.add("Kallyan");
        names.add("Shree");
        names.add("Kartik");
        names.add("Sooraj");
        names.add("Niks");
        names.add("Shubh");
        System.out.println("Size:- " + names.size());
        for (String s : names) {
            System.out.println(s);
        }
    }
}
