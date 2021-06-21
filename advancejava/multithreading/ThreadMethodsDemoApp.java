package advancejava.multithreading;
class MyThread1 extends Thread{
    public static Thread mainThread;
    public void run(){
        try {
            mainThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i + Thread.currentThread().getName());
        }
    }
}

class DaemonChild implements Runnable{
    public static Thread thread1;
    public void run(){
        try{
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i + Thread.currentThread().getName());
        }
    }
}

public class ThreadMethodsDemoApp {
    public static void main(String[] args) throws InterruptedException {

        MyThread1.mainThread = Thread.currentThread();


        // naming methods
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("Sooraj");
        System.out.println("Current Thead: " + Thread.currentThread().getName());


        //daemon thread methods
        DaemonChild daemonChild = new DaemonChild();
        Thread t = new Thread(daemonChild);


        t.setDaemon(false);
        System.out.println("isDaemon: " + t.isDaemon());
        t.start();
        //t.join();/////////////////////join method......

        MyThread1 thread1 = new MyThread1();
        DaemonChild.thread1 = thread1;
        thread1.setDaemon(false);
        thread1.start();
        //thread1.join();/////////////////////join method......
        System.out.println("MyThread1 isDaemon: "+ Thread.currentThread().isDaemon());



        // Priority based methods
        thread1.setPriority(Thread.MIN_PRIORITY);
        System.out.println("Priority of thread1: "+thread1.getPriority());
        System.out.println("Priority of DaemonChild: " + t.getPriority());
    }
}