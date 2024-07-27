package Recursion.Patterns;

public class Pattern {
    public static void main(String[] args) {
        patternusingRecursion(5, 0);
    }

    private static void pattern1(int i) {
        for (int j = i; j > 0; j--) {
            for (int k = 0; k < j; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //r=5,c=5
    private static void patternusingRecursion(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            System.out.print("* ");
            patternusingRecursion(r, c + 1);
        } else {
            System.out.println();
            patternusingRecursion(r - 1, 0);
        }
    }
    private static void patternusingRecursion2(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            patternusingRecursion(r, c + 1);
            System.out.print("* ");
        } else {
            patternusingRecursion(r - 1, 0);
            System.out.println();
        }
    }
}
