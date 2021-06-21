package advancejava.collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Sooraj");
        names.add("Dhiraj");
        names.add("Gauri");
        names.add("Sanvi");
        names.add("Avani");
        names.add("Kalyani");
        names.add("Kavya");
        names.add("Aayush");
        names.add("Kartik");
        names.add("Vaibhav");
        System.out.println(names);

        ListIterator litr = names.listIterator();

        while (litr.hasNext()){
            String s = (String) litr.next();
            if (s.equals("Sooraj")){
                litr.add("Shraddha");
            }
            else if(s.equals("Dhiraj")){
                litr.set("Dheerubhai");
            }
            else if(s.equals("Kartik")){
                litr.remove();
            }
        }

        System.out.println(names);
    }
}
