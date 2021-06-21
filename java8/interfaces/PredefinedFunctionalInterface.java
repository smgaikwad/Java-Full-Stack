package java8.interfaces;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class Employee{
    private String name;
    private int salary;
    private String designation;
    private int experience;

    public Employee(String name, int salary, String designation, int experience) {
        this.name = name;
        this.salary = salary;
        this.designation = designation;
        this.experience = experience;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", designation='" + designation + '\'' +
                ", experience=" + experience +
                '}';
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}

public class PredefinedFunctionalInterface {
    public static void main(String[] args) {
        Predicate<Integer> p1 = i-> i%2 == 0;
        Predicate<Employee> employeePredicate = e -> e.getName().equals("Vaibhav Atkale");
        Predicate<Employee> employeePredicate1 = e -> e.getDesignation().equals("Software Engineer");

        System.out.println(p1.test(10));
        System.out.println(p1.test(15));
        System.out.println(p1.test(20));

        Employee sooraj = new Employee("Sooraj Gaikwad", 20000, "Software Engineer", 2);
        Employee dhiraj = new Employee("Dhiraj Gaikwad", 200000, "Civil Engineer", 21);
        Employee vaibhav = new Employee("Vaibhav Atkale", 2000000, "Mechanical Engineer", 23);

        System.out.println(employeePredicate.test(sooraj));
        System.out.println(employeePredicate.test(dhiraj));
        System.out.println(employeePredicate.test(vaibhav));
        System.out.println(employeePredicate.and(employeePredicate1).test(vaibhav));


        Function<Integer, Integer> squre  = (i)-> i*i;

        System.out.println(squre.apply(2));
        System.out.println(squre.apply(22));
        System.out.println(squre.apply(20));

        Consumer<Integer> print = i -> System.out.println(i);
        print.accept(10);


        Supplier<String> supplier = ()->{
            String otp = "";
            for (int j = 0; j < 6; j++) {
                otp += (int)(Math.random()*10);
            }
            return otp;
        };

        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());
    }
}
