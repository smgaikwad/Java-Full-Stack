package immutableclass;
final class Immutable{

    final private int a;
    public Immutable(int a) {
        this.a = a;
    }


    public int getPropertyValue(){
        return this.a;
    }
}
public class ImmutableClassDemo {
    public static void main(String[] args) {

        Immutable immutable = new Immutable(10);
        Immutable immutable1 = new Immutable(20);
        Immutable immutable2 = new Immutable(30);
        Immutable immutable3 = new Immutable(40);

        System.out.println(immutable.getPropertyValue());
        System.out.println(immutable1.getPropertyValue());
        System.out.println(immutable2.getPropertyValue());
        System.out.println(immutable3.getPropertyValue());


    }
}