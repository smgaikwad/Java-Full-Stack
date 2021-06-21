package java11;

public class EpsilonDemo {

    public static void main(String[] args) {

        final int GIGABYTE = 1024 * 1024 * 1024;
        final int ITERATIONS = 100;

        System.out.println("Starting allocations...");

        // allocate memory 1GB at a time
        while (true){
            var array = new byte[GIGABYTE];
        }

        //System.out.println("Completed successfully");
    }
}