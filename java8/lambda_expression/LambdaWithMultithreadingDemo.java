package java8.lambda_expression;

public class LambdaWithMultithreadingDemo {
    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(()-> {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(1000, 12);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(i);
                Thread.yield();
            }
        });

        Thread thread1 = new Thread(()->
        {
            for (int i = 10; i >= 0; i--) {
//                try {
//                    Thread.sleep(100, 12);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                System.out.println(i);
            }
        });

        thread.start();
        thread1.start();
    }
}
