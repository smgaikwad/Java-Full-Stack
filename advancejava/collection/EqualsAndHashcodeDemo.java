package advancejava.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class EqualsAndHashcodeDemo {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1);
        Employee emp2 = new Employee(1);

        Map<Employee,String> myMap = new HashMap<Employee,String>();
        myMap.put(emp1, "one");
        myMap.put(emp2, "one");

        System.out.println(myMap.size());

        Integer i1 = new Integer(1);
        Integer i2 = new Integer(1);

        Map<Integer,String> mymap2 = new HashMap<Integer,String>();
        mymap2.put(i1,"one");
        mymap2.put(i2,"one");

        System.out.println(mymap2.size());

    }
}

class Employee{
    int id;

    public Employee(int id){
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}