package Sorting;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {4,3,0,1,5};
        int r=missingNumber(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(r);

    }

    private static int missingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i];
            if (arr[i]< arr.length && arr[i] != arr[correctIndex]) {
                int tmp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = tmp;
            } else {
                i++;
            }
        }
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return index;
            }
        }

        // case 2
        return arr.length;
    }
}
