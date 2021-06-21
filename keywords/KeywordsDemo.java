package keywords;

public class KeywordsDemo {

    public static void main(String[] args) {
        StaticDemo sd1 = new StaticDemo();
        StaticDemo sd2 = new StaticDemo();
        StaticDemo sd3 = new StaticDemo();

        StaticDemo.count ++;
        System.out.println(sd1.getCount());
        System.out.println(sd2.getCount());
        System.out.println(sd3.getCount());

        StaticDemo.count ++;
        System.out.println(sd1.getCount());
        System.out.println(sd2.getCount());
        System.out.println(sd3.getCount());
        //#####################################################################

        FinalDemo fd = new FinalDemo();
        //fd.PI = 3.15f;  // cannot assign value to final variable PI



    }
}

class StaticDemo{
    public static int count;

    public int getCount(){
        return count;
    }
}

class FinalDemo{
    public final float PI = 3.14f;

    public float getPi(){
        return PI;
    }
}

