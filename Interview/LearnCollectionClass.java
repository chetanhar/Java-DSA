package Interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnCollectionClass {
    public static void main(String[] args) {
        List<Integer> ls=new ArrayList<>();
        ls.add(1);
        ls.add(5);
        System.out.println(Collections.min(ls));
        System.out.println(Collections.max(ls));
        System.out.println(Collections.nCopies(5,"Hello"));


    }
}
