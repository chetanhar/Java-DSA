package Pattern;

public class AllPatterns {
    public static void main(String[] args) {
        pattern1(5);
    }

    private static void pattern1(int num) {
        for (int row = 1; row <= num; row++) {
            for (int j = 1; j <= row; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    private static void pattern2(int num) {
        for (int row = 0; row <= num-1; row++) {
            for (int j = 0; j < num-row; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    private static void pattern3(int n){
        for (int row = 0; row < 2 * n; row++) {
            int totalColsInRow = row > n ? 2 * n - row: row;
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
                System.out.println();
        }
    }
    private static void pattern28(int n){
        for (int row = 0; row < 2 * n; row++) {
            int totalColsInRow = row > n ? 2 * n - row: row;
            int totalnoofSpaces=n-totalColsInRow;
            for (int i = 0; i < totalnoofSpaces; i++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    private static void pattern30(int n){
        for (int row = 0; row < n; row++) {
            for (int spaces = 0; spaces < n-row; spaces++) {
                System.out.print("  ");
            }
            for (int col = row+1; col > 1; col--) {
                System.out.print(col+" ");
            }
            for (int col = 1; col <=row+1; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    private static void pattern17(int n){
        for (int row = 0; row < 2*n; row++) {
            int c=row>n?2*n-row:row;
            for (int spaces = 0; spaces < n-c; spaces++) {
                System.out.print(" ");
            }
            for (int col = c+1; col >1; col--) {
                System.out.print(col);
            }
            for (int i = 1; i <= c+1; i++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
