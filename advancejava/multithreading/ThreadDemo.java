package advancejava.multithreading;
class MyNewThread extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(i + ",");
        }
    }
}
class MyNewThread1 extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
        for (int i = 100; i >0; i--) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(i + ",");
        }
    }
}
public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        MyNewThread thread1 = new MyNewThread();
        MyNewThread1 thread2 = new MyNewThread1();
       thread1.run();
       thread2.run();
    }
}
