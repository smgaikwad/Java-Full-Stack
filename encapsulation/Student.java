package encapsulation;

public class Student {
    private int rollNo;
    private int prnNo;
    private String name;
    private String Course;

    public Student(int rollNo, int prnNo, String name, String course) {
        this.rollNo = rollNo;
        this.prnNo = prnNo;
        this.name = name;
        Course = course;
    }

    public Student() {
    }

    public void setRollNo(int rollNo) {
        try {
            if (rollNo < 0)
                throw new MyException("Roll no must be greater than 0");
            else
                this.rollNo = rollNo;
        }
        catch (Exception e){
            System.out.println(e);
        }

    }

    public void setPrnNo(int prnNo) {
        try {
            if (prnNo < 0)
                throw new MyException("prn no must be greater than 0");
            else
                this.prnNo = prnNo;
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourse(String course) {
        Course = course;
    }

    public int getRollNo() {
        return rollNo;
    }

    public int getPrnNo() {
        return prnNo;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return Course;
    }
}
