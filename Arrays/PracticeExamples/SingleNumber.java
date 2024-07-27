package PracticeExamples;

import java.util.*;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums={0,1,0,1,0,1,99};
        System.out.println(singleNumber(nums));
    }

    private static int singleNumber(int[] arr) {
       HashMap<Integer,Integer> hs=new HashMap<>();
        for (int i:
             arr) {
            hs.put(i,hs.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> e:hs.entrySet()){
            if(e.getValue()!=3)return e.getKey();
        }
        return -1;
    }
}
