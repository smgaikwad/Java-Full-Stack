package advancejava.collection;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {
    public static void main(String[] args) {
        ConcurrentHashMap <Integer, String> concurrentHashMap = new ConcurrentHashMap<Integer, String>();

        concurrentHashMap.put(1, "one");
        concurrentHashMap.put(2, "Two");
        concurrentHashMap.put(3, "Three");
        concurrentHashMap.put(4, "Four");
        concurrentHashMap.put(5, "Five");

        Iterator<Integer> itr = concurrentHashMap.keySet().iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
            concurrentHashMap.put(6, "six");
        }
    }
}
