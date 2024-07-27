package Interview;

import java.util.Arrays;

public class ArrayClass {
    public static void main(String[] args) {
        int[] ar={1,2,3,4,5};
        int index= Arrays.binarySearch(ar,3);
        System.out.println(index);

        int[] ar1={1,2,3,4,5,10,7};
        Arrays.sort(ar1);
        System.out.println(Arrays.toString(ar1));

    }
}
