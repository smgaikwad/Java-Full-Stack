package enumeration;

enum subject {
    JAVA(60), CPP(30), C(60),PHP(80), DBMS(100), PYTHON(150), JAVASCRIPT;

    private int marks;

    subject(){
        System.out.println("marks for "+ this.name() + " not given");
    }

    subject(int marks){
        this.marks = marks;
    }

    int getMarks(){
        return this.marks;
    }
}
public class EnumDemo {
    public static void main(String[] args) {
//        System.out.println(subject.PYTHON.getMarks());
//        System.out.println(subject.JAVASCRIPT.getMarks());

        subject selectedSubject = subject.PHP;

        System.out.println("selected subject is "+ selectedSubject);

        switch (selectedSubject){
            case PYTHON:
                System.out.println("Python is selected");
                break;
            case JAVA:
                System.out.println("Java is selected");
                break;
            case JAVASCRIPT:
                System.out.println("Javascript is selected");
                break;
            case C:
                System.out.println("C is selected");
                break;
            case CPP:
                System.out.println("CPP is selected");
                break;
            case DBMS:
                System.out.println("DBMS is selected");
                break;
            default:
                try {
                    throw new Exception("subject is not valid...");
                }catch (Exception e){
                    System.out.println(e);
                }
        }


        subject s[] = subject.values();
        System.out.println("All subject list:");
        for (subject sub: s){
            System.out.println(sub);
        }
    }
}
