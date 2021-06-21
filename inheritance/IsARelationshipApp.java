package oopconcepts;
public class IsARelationshipApp {
    public static void main(String[] args) {
        Student ram=new ArtStudent(36,"ram",90.0f);
        Student shyam=new ArtStudent(30,"shyam",90.0f);
        Student mark=new CommerseStudent(36,"mark",90.0f);
        Student bob=new CommerseStudent(30,"bob",90.0f);
        System.out.println(ram);
        System.out.println(shyam);
        System.out.println(mark);
        System.out.println(bob);
    }
}
