package objectcreation;

public class CloneObject {
    public static void main(String[] args)throws CloneNotSupportedException {
        Clone obj = new Clone();

        //create a copy of clone object in clone1 object
        Clone obj1 = (Clone) obj.clone();

        obj.a = 20;
        obj1.a = 30;
        System.out.println(obj + "\n" + obj1);
    }
}

class Clone implements Cloneable{
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    int a = 10;

    @Override
    public String toString() {
        return "Clone{" +
                "a=" + a +
                '}';
    }
}
