package java8.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(21);
        list.add(300);
        list.add(41);
        list.add(500);
        list.add(61);
        list.add(700);

        List<Integer> list1 = list.stream().filter(i-> i%2==0).collect(Collectors.toList());
        list1.stream().forEach(System.out::println);
        List<Integer> list2 = list.stream().map(i ->{
            i = i - 10 + 20 - 10 +20;
            return i;
        }).collect(Collectors.toList());
        list2.stream().forEach(System.out::println);

        list.stream().sorted().forEach(System.out::println);
        System.out.println(list.stream().min((i,j)-> i.compareTo(j)).get());
        System.out.println(list.stream().max((i,j)-> i.compareTo(j)).get());

        Integer[] i = list.stream().toArray(Integer[]::new);
        Arrays.stream(i).forEach(System.out::println);
    }

}
