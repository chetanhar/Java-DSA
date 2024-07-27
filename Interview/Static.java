package Interview;

import java.io.IOException;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Static {
    private static String college="ch";
    int h=4;

    public static void main(String[] args) throws IOException, ParseException, ClassNotFoundException, SQLException {
//        SimpleDateFormat df=new SimpleDateFormat("yyyy/MM/dd");
//        long date=System.currentTimeMillis();
//        System.out.println(df.format(new Date(date)));

//        Random r=new Random();
//        for (int i = 0; i < 10; i++) {
//            System.out.println(r.nextInt());
//        }

//        Runtime rs = Runtime.getRuntime();
//        System.out.println("Free memory in JVM before Garbage Collection ="+rs.freeMemory());
//                rs.gc();
//        System.out.println("Free memory in JVM after Garbage Collection ="+rs.freeMemory());
//        Runtime rs1 = Runtime.getRuntime();
//        rs1.exec("notepad");

//        String da="23-12-2023";
//        SimpleDateFormat form=new SimpleDateFormat("dd-MM-yyyy");
//        System.out.println(form.parse(da));

//        String url="jdbc:mysql://localhost:3306/profile";
//        String user="root";
//        String pass="root@123";
//
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        Connection con= DriverManager.getConnection(url, user, pass);
//        if (con != null) {
//            System.out.println("Connected to the database!");
//            con.close();
//        } else {
//            System.out.println("Failed to make connection!");
//        }
//        String c="500";
//        int p=13;
//        System.out.println(String.valueOf(p));
//        System.out.println(Integer.parseInt(c));
//        String f="2023-01-01";
//        SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd");
//        long da=System.currentTimeMillis();
//        System.out.println(sd.format(new Date(da)));
//
//        ArrayList<Integer> al=new ArrayList<>();
//        al.add(1);
//        al.add(2);
////        al.add(3);
////        Integer[] ar=al.toArray(new Integer[al.size()]);
////        Iterator i= al.iterator();
////        while (i.hasNext()){
////            System.out.println(i.next());
////        }
////        System.out.println(al);
////        LinkedList<Integer> ls=new LinkedList<>();
////        ls.add(1);
////        ls.add(2);
////        ls.add(3);
////        System.out.println(ls);
////        Iterator i=ls.iterator();
////        while (i.hasNext()){
////            System.out.println(i.next());
////        }
//        HashSet<Integer> hs=new HashSet<>();
//        hs.add(1);
//        hs.add(2);
//        hs.add(3);
//        Iterator i=hs.iterator();
//        while (i.hasNext()){
//            System.out.println(i.next());
//        }
//        System.out.println(hs);

//        Stack<Integer> stack=new Stack<>();
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//        System.out.println(stack);
//        System.out.println(stack.pop());
//        System.out.println(stack);
//        System.out.println(stack.peek());

//        Queue<Integer> queue=new LinkedList<>();
//        queue.offer(1);
//        queue.offer(2);
//        queue.offer(3);
//        queue.offer(4);
//        System.out.println(queue);
//        System.out.println(queue.peek());
//        System.out.println(queue.poll());
//        System.out.println(queue);
        //queue.add();
        //queue.element();
        //queue.remove();
//        Queue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
//        pq.add(1);
//        pq.add(4);
//        pq.add(3);
//        pq.add(2);
//        System.out.println(pq);
//        System.out.println(pq.poll());
//        System.out.println(pq);

//        ArrayDeque<Integer> dq=new ArrayDeque<>();
//        dq.offerFirst(1);
//        dq.offerLast(3);
//        dq.offerFirst(5);
//        System.out.println(dq);
//        System.out.println(dq.peekLast());
//        System.out.println(dq.pollLast());
//        System.out.println(dq);
        int[] ar1={1,2,3,4};
        int[] ar2={5,6,7,8};
        int[] newar=new int[ar1.length+ar2.length];

        System.arraycopy(ar1,0,newar,0,ar1.length);
        System.arraycopy(ar2,0,newar,ar1.length,ar2.length);
        System.out.println(Arrays.toString(newar));

        int p=012;
        System.out.println(String.valueOf(p));

    }
    static void Method(){
        System.out.println("d");
    }

}
