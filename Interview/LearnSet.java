package Interview;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
    public static void main(String[] args) {
        //values are unique
        //in HashSet-mixup
        //Set<Integer> set=new HashSet<>();
        //in LinkedHashSet-- in same way as they are added
       //Set<Integer> set=new LinkedHashSet<>();
        //in Treeset --Sorted order
        Set<Integer> set=new TreeSet<>();
        set.add(10);
        set.add(100);
        set.add(5);
        set.add(9);
        System.out.println(set);

    }
}
