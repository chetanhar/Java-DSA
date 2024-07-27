package PracticeExamples;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        System.out.println(removeDuplicates(list));
    }

    private static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) {
        ArrayList<Integer> list1=new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(!list1.contains(list.get(i))) {
                list1.add(list.get(i));
            }
        }
        return list1;
    }
}
