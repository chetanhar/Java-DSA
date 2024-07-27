package BinarySearch_;

import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{10, 20, 30, 40},
                {15, 25, 35, 45},
                {16, 26, 36, 46},
                {17, 27, 37, 47}};
        //System.out.println(Arrays.deepToString(matrix).replace("], ", "]\n"));
        System.out.println(Arrays.toString(searchmat(matrix, 46)));
    }

    private static int[] searchmat(int[][] matrix, int target) {
        int r = 0;
        int c = matrix[0].length - 1;
        while (matrix.length > 0 && c >= 0) {
            if (matrix[r][c] == target) {
                return new int[]{r, c};
            }
            if (matrix[r][c] < target) {
                r++;
            }
            if (matrix[r][c] > target) {
                c--;
            }
        }
        return new int[]{-1, -1};
    }
}