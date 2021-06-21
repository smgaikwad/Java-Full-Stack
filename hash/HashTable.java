package hash;

import java.util.Hashtable;

public class HashTable {
    public static void main(String[] args) {
        Hashtable<String, Integer> hash = new Hashtable<>();

        hash.put("Sunday", 1);
        hash.put("Monday", 2);
        hash.put("Tuesday", 3);
        hash.put("Wedensday", 4);
        hash.put("Thirsday", 5);
        hash.put("Friday", 6);
        hash.put("Saturday", 7);

        System.out.println(hash);
        System.out.println(hash.get("Thirsday"));
        System.out.println(hash.size());
        System.out.println(hash.keySet());
        System.out.println(hash.containsKey("Saturday"));
        System.out.println(hash.entrySet());
        System.out.println(hash.hashCode());

    }
}
