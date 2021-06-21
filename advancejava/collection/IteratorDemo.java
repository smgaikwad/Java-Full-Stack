package advancejava.collection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        Collection vaues = new ArrayList();
        for (int i = 0; i < 11; i++) {
            vaues.add(i);
        }
        System.out.println(vaues);
        Iterator itr = vaues.iterator();

        while (itr.hasNext()){
            Integer i = (Integer) itr.next();
            if (i % 2 == 0)
                System.out.print(i+" ");
            else
                itr.remove();
            //vaues.add(80);                         // ConcurrentModificationException
        }

        System.out.println(vaues);
    }
}