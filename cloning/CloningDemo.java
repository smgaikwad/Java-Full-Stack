package cloning;
public class CloningDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Clone c = new Clone();
        c.a = 10;
        c.b = 20;

        // shallow copy........
        Clone c1 = c;
        System.out.println(c1);
        c1.b = 30;
        c1.a = 40;
        System.out.println(c1);
        System.out.println(c);


        //deep copy.........
        ABC obj = new ABC();
        ABC obj1 = (ABC)obj.clone();
        obj1.a = 50;
        obj1.b = 50;

        System.out.println(obj);
        System.out.println(obj1);
    }
}

class Clone{
    int a;
    int b;
    Clone(){

    }

    @Override
    public String toString() {
        return "Clone{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}

class ABC implements Cloneable{
    int a = 10;
    int b = 20;
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    @Override
    public String toString() {
        return "ABC{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}