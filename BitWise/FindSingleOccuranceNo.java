package BitWise;

public class FindSingleOccuranceNo {
    public static int findSingleNumber(int[] nums) {
        int result=0;
        for(int i=0;i<8;i++){
            int sum=0;
            for(int num:nums){
                sum+=(num>>i)&1;
            }
            result |= (sum % 3) << i;
        }
            return result;
    }


    public static void main(String[] args) {
        int[] nums = {3, 3, 3, 2,2, 2, 4,4,4,6};
        int result = findSingleNumber(nums);
        System.out.println("The number that appears only once is: " + result);
    }
}
