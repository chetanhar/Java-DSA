package Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {
    public static void main(String[] args) throws Exception {
        CircularQueue que=new CircularQueue(5);
        que.insert(1);
        que.insert(2);
        que.insert(3);
        que.insert(4);

        que.insert(5);
        que.display();
        System.out.println(que.front());
        //que.insert(4);
        Queue<Integer> qu=new LinkedList<>();
        qu.offer(1);
        System.out.println(qu);
    }
}
