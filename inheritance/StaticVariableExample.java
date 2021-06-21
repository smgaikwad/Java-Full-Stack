package oopconcepts;

import static oopconcepts.Student.getStudentCount;

public class StaticVariableExample {
    public static void main(String[] args) {
        Student sooraj=new Student(36,"sooraj",90.00f);
        Student sush=new Student(14,"sushant",90.00f);
        Student shre=new Student(17,"shree",90.00f);
        Student tejal=new Student();
        Student vishwa=new Student();
        getStudentCount();
    }
}
