package Recursion.Patterns;

import java.util.Arrays;

public class SortUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {4, 3, 5, 1};
        bubble(arr, arr.length - 1, 0);
        //selection(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubble(int[] arr, int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            if (arr[c] > arr[c + 1]) {
                int tmp = arr[c + 1];
                arr[c + 1] = arr[c];
                arr[c] = tmp;
            }
            bubble(arr, r, c + 1);
        }
        bubble(arr, r - 1, c);
    }

    static void selection(int[] arr, int r, int c, int max) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            if (arr[c] > arr[max]) {
                selection(arr, r, c + 1, c);
            } else {
                selection(arr, r, c + 1, max);
            }
        } else {
            int temp = arr[max];
            arr[max] = arr[r - 1];
            arr[r - 1] = temp;
            selection(arr, r - 1, 0, 0);
        }
    }

}
