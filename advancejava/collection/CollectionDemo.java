package advancejava.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

interface Demo1<T> extends Iterable<Integer>{

}

public class CollectionDemo {
    public static void main(String[] args) throws ClassCastException {
        List<Integer> values = new ArrayList<>();

        values.add(101);
        values.add(20);
        values.add(301);
        values.add(40);
        values.add(501);
        values.add(60);
        values.add(701);
        values.add(80);
        values.add(901);
        values.add(100);

        Collections.sort(values,(i, j)->i>j?1:-1);
        System.out.println(values);
    }
}
