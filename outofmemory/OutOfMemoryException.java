package outofmemory;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class OutOfMemoryException {
    public static void main(String args[]) {
        Map<Integer, String> dataMap = new HashMap<>();
        Random r = new Random();
        while (true) {
            dataMap.put(r.nextInt(), String.valueOf(r.nextInt()));
        }
    }
}
