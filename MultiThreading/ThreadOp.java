package MultiThreading;

class UserThread extends Thread{
    @Override
    public void run() {
        System.out.println("thread is running");
    }
}

public class ThreadOp {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Program Started");
        int sum =12+32;
        System.out.println("sum is "+ sum);
        Thread t1=Thread.currentThread();
        System.out.println(t1.getName());
        t1.setName("newMain");
        System.out.println(t1.getName());
        Thread.sleep(1000);
        System.out.println(t1.getId());
        System.out.println("Program ended");
        UserThread ut=new UserThread();
        ut.start();
    }
}
