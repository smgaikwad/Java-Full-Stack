package garbagecollection;

public class GarbageCollectorApp {
    public static void main(String[] args) throws InterruptedException
    {
        GarbageCollectorApp gc1 = new GarbageCollectorApp();
        GarbageCollectorApp gc2 = new GarbageCollectorApp();

        gc1 = null;
        System.gc();
        gc2 = null;
        Runtime.getRuntime().gc();


    }

    @Override
    protected void finalize() throws Throwable
    {
        System.out.println("Garbage collector called");
        System.out.println("Object garbage collected : " + this);
    }
}
