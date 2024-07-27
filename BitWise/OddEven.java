package BitWise;

public class OddEven {
    public static void main(String[] args) {
        int n = 13;
        if (isodd(n) == true) {
            System.out.println("odd");
        }else{
            System.out.println("even");
        }
    }
    private static boolean isodd(int n) {
        return (n&1)==1;

    }
}
