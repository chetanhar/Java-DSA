package String;

public class LongestGoodNo {
    public static void main(String[] args) {
        System.out.println(largestGoodInteger("222"));
    }

    public static String largestGoodInteger(String num) {
        int ln = num.length() - 1;
        int result = Integer.MIN_VALUE;
        for (int i = 0; i < ln - 1; i++) {
            if ((num.charAt(i) == num.charAt(i + 1)) && (num.charAt(i) == num.charAt(i + 2)))
                result = Math.max(result, Character.getNumericValue(num.charAt(i)));
        }
        return (result >= 0) ? String.format("%d%d%d", result, result, result) : "";

    }
}
