package java8.lambda_expression;

public class Student {
    String name;
    int rollNo;
    float marks;
    String address;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", marks=" + marks +
                ", address='" + address + '\'' +
                '}';
    }

    public Student(String name, int rollNo, float marks, String address) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public float getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
