package advancejava.multithreading;
class MyThread implements Runnable{
    @Override
    public void run() {
        System.out.println("I am a new Thread created by Runnable interface");
    }
}
public class RunnableThreadDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        Thread th = new Thread(t1);
        th.start();
    }
}