package Stack_Queue.LeetCodeQuestions;

import java.util.Arrays;
import java.util.Stack;

public class HistogramArea {
    public static void main(String[] args) {
        int[] nums = {2, 1, 5, 6, 9, 8};
//        System.out.println(Arrays.toString(previousSmaller(nums)));
//        System.out.println(Arrays.toString(nextSmaller(nums)));
        System.out.println(maxArea(nums));
        System.out.println(largestRectangleArea(nums));
    }
    public static int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int max = 0;

        stack.push(0);

        for (int i = 1; i < heights.length; i++) {
            while (!stack.isEmpty() && heights[i] < heights[stack.peek()]) {
                max = getMax(heights, stack, max, i);
            }
            stack.push(i);
        }

        int i = heights.length;
        while (!stack.isEmpty()) {
            max = getMax(heights, stack, max, i);
        }

        return max;
    }

    private static int getMax(int[] arr, Stack<Integer> stack, int max, int i) {
        int area;
        int popped = stack.pop();
        if (stack.isEmpty()) {
            area = arr[popped] * i;
        } else {
            area = arr[popped] * (i - 1 - stack.peek());
        }
        return Math.max(max, area);
    }
    public static int maxArea(int[] a){
        int maxAns=0;
        int[] ps=previousSmaller(a);
        int[] ns=nextSmaller(a);
        for (int i = 0; i < a.length; i++) {
            int curr=(ns[i]-ps[i]-1)*a[i];
            maxAns=Math.max(maxAns,curr);
        }
        return maxAns;
    }

    public static int[] previousSmaller(int[] a) {
        int[] ps = new int[a.length];
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < a.length; i++) {
            while (!s.isEmpty()&&a[s.peek()] >= a[i]) {
                s.pop();
            }
            if(s.isEmpty()){
                ps[i]=-1;
            }else{
                ps[i]=s.peek();
            }
            s.push(i);
        }
        return ps;
    }
    public static int[] nextSmaller(int[] ar){
        int[] ns=new int[ar.length];
        Stack<Integer> s=new Stack<>();
        for (int i = ar.length-1; i >=0; i--) {
            while(!s.isEmpty()&&ar[s.peek()]>=ar[i]){
                s.pop();
            }
            if(s.isEmpty()){
                ns[i]=ar.length;
            }else {
                ns[i]=s.peek();
            }
            s.push(i);
        }
        return ns;
    }
}