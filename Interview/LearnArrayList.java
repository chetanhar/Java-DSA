package Interview;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnArrayList {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        list.remove(Integer.valueOf(10));
        list.get(2);
        System.out.println(list);
        list.set(1,5);
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));

        }
//        for (Integer ele:list
//             ) {
//            System.out.println(ele);
//        }
//        Iterator<Integer> it=list.iterator();
//        while (it.hasNext()){
//            System.out.print(it.next());
//        }
    }
}
