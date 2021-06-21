package hash;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> numbers = new HashMap<>();

        numbers.put("one", 1);
        numbers.put("two", 2);
        numbers.put("three", 3);
        numbers.put("four", 4);

        System.out.println(numbers);
        numbers.remove("two");

        System.out.println(numbers);
        System.out.println(numbers.keySet());
        System.out.println(numbers.values());
        System.out.println(numbers.entrySet());

        Set<Map.Entry<String, Integer>> entries = numbers.entrySet();

        for (Map.Entry<String, Integer> entry : entries) {
            entry.setValue(entry.getValue() * 10);
        }

        System.out.println(numbers);
    }
}
