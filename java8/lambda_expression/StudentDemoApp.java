package java8.lambda_expression;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class StudentDemoApp {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Sooraj",31,91.02f, "Pune"));
        students.add(new Student("Dhiraj",21,81.02f, "Pandharpur"));
        students.add(new Student("Nikhil",41,71.02f, "Mumbai"));
        students.add(new Student("Pradip",51,61.02f, "USA"));
        students.add(new Student("Saurabh",61,51.02f, "UK"));


        System.out.println(students.stream().max((i,j)-> i.marks > j.marks?1:-1));
        students.stream().filter(i -> i.name.equals("Sooraj")).collect(Collectors.toList()).forEach(System.out::println);
    }
}
