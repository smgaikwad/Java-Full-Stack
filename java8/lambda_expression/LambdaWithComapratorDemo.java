package java8.lambda_expression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaWithComapratorDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList =  new ArrayList<>();
        arrayList.add(10);
        arrayList.add(200);
        arrayList.add(32);
        arrayList.add(1);
        arrayList.add(100);

        Collections.sort(arrayList, (i,j)-> i>j?1:-1);
        arrayList.stream().forEach(System.out::println);

        List<Integer> arrayList1 = arrayList.stream().filter(i->i%2==0).collect(Collectors.toList());

        arrayList1.stream().forEach(System.out::println);
    }
}
