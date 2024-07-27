package Arrays;

import java.util.ArrayList;
import java.util.Objects;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> ar=new ArrayList<>();
        ar.add(1);
        ar.add(2);
        ar.add(2);
        ar.add(2);
        ar.add(3);
        ar.add(4);
        System.out.println(removeDuplicates(ar,6));
    }
    public static int removeDuplicates(ArrayList<Integer> arr,int n) {
        int j=0;
        for (int i = 1; i < n; i++) {
            if(!Objects.equals(arr.get(j), arr.get(i))){
                j++;
                arr.set(j,arr.get(i));
            }
        }
        return j+1;
    }
}
