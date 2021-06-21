package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList myList = new ArrayList(9);
        Student sooraj = new JuniorStudent(36,"SOORAJ",98.99f,"A");
        Student niks = new Student(22,"NIKS",99.99999999f,"B");
        Student shubh = new Student(25,"SHUBH",97.99f,"B");
        myList.add(sooraj);
        myList.add(niks);
        myList.add(shubh);
        System.out.println(myList.get(2));
//        Iterator itr = myList.iterator();
//
//        while(itr.hasNext()) {
//            Student student = (Student) itr.next();
//            System.out.println(student);
//        }
        Collections.sort(myList, (Student i,Student j)->i.name.length() > j.name.length()?1:-1);
        for (Object s:myList) {
            System.out.println(s);
        }
    }
}

class Student
{
    int roll;
    String name;
    float marks;
    String div;

    Student(int roll, String name, float marks, String div)
    {
        this.roll=roll;
        this.name=name;
        this.div=div;
        this.marks=marks;
    }

    public String toString()
    {
        return "Name: "+name+" RollNo: "+roll+" Div: "+div+" Marks: "+marks;
    }
}

class JuniorStudent extends Student
{

    JuniorStudent(int roll, String name, float marks, String div) {
        super(roll, name, marks, div);
    }

}