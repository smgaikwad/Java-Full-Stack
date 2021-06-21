package oopconcepts;

public class Student {
    static int noOfStudents=0;
    protected int roll;
    protected String name;
    protected float marks;
    protected String branch;

    Student(int roll,String name,float marks)
    {
        this.name=name;
        this.roll=roll;
        this.marks=marks;
        noOfStudents++;
    }
    Student()
    {

    }
    public static void getStudentCount()
    {
        System.out.println("No of students: "+noOfStudents);
    }
    public String toString()
    {
        return "Name: "+name+" Roll No: "+roll+" Marks: "+marks+" Branch: "+branch;
    }
}
