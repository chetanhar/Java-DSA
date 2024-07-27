package MultiThreading;

public class MyAnotherThread extends Thread{

    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("another thread");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        MyAnotherThread t1=new MyAnotherThread();
        t1.start();
    }
}
