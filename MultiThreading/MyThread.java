package MultiThreading;

public class MyThread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread is Running");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        MyThread t1=new MyThread();
        Thread th=new Thread(t1);
        MyAnotherThread t2=new MyAnotherThread();
        t2.start();
        th.start();
    }
}
