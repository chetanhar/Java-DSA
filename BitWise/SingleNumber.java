package BitWise;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums={4,1,2,1,2};
        System.out.println(findUnique(nums));
    }

    private static int findUnique(int[] nums) {
        int unique=0;
        for(int a:nums){
            unique ^= a;
        }
        return unique;
    }
}
