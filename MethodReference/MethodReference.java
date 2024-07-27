package MethodReference;

public class MethodReference {
    public static void main(String[] args) {
        System.out.println("Learning Method Reference");
        Task task=()-> {
            System.out.println("Lambda call");
            return 1;
        };
        Task task1=Stuff::doStuff;
        System.out.println(task1.doTask());
        Runnable r=Stuff::doStuff;
        Thread t=new Thread(r);
        t.start();
        Runnable r1=Stuff::doStuffsecond;
        Thread t1=new Thread(r);
        t1.start();
    }
}
