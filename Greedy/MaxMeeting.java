package Greedy;

import java.util.HashMap;

public class MaxMeeting {
    public static void main(String[] args) {
        System.out.println(maxMeetings(new int[]{1, 3, 0, 5, 8, 5}, new int[]{2, 4, 6, 7, 9, 9},6));
    }
    public static int maxMeetings(int start[], int end[], int n)
    {
        HashMap<Integer, Integer> ti=new HashMap<>();
        for (int i = 0; i < n; i++) {
            ti.put(start[i],end[i]);
        }
        System.out.println(ti);
        return 1;

    }
}
