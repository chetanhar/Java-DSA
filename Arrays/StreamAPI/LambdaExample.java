package StreamAPI;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class LambdaExample {
    public static void main(String[] args) {
//        FunctionalInterface functionalInterface = (a, b) -> a + b;
//        System.out.println(functionalInterface.myMethod(23, 34));
//        BiFunction<Integer, Integer, Integer> biFunction = (a, b) -> a * b;
//        System.out.println(biFunction.apply(15, 13));
//        FunctionalInterface fv = (a, b) -> {
//            String cd = "your output is ==> ";
//            int sum = a + b;
//            System.out.print(cd);
//            return sum;
//        };
//        System.out.println(fv.myMethod(45, 34));
//        Runnable r=new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Thread is runnning");
//            }
//        };
//        Thread t=new Thread(r);
//        t.run();
//        Runnable r2=()-> {
//            System.out.println("Thread2 is running");
//        };
//        Thread t2=new Thread(r2);
//        t2.run();

//        List<Integer> ls=new ArrayList<>();
//        ls.add(1);
//        ls.add(10);
//        ls.add(211);
//        ls.add(24);
//        ls.add(3);
//        ls.forEach(n-> System.out.println(n));
//        ls.sort((a,b)->a.compareTo(b));
//        ls.forEach(n-> System.out.println(n));
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread is running");
            }
        };
        Thread t = new Thread(r);
        t.start();
        Runnable r1 = () -> System.out.println("Thread by Lambda");
        Thread t1 = new Thread(r1);
        t1.start();
        FunctionalInterface fi=(c,d)->c+d;
        System.out.println(fi.myMethod(12,13));
    }
}
