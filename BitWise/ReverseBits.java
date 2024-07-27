package BitWise;

public class ReverseBits {
    public static void main(String[] args) {
//        int num=42949672;
//        String c=Integer.toBinaryString(num);
//        int intvalue=Integer.parseUnsignedInt(c,2);
//        System.out.println(intvalue);
//        char[] ar=c.toCharArray();
//        System.out.println(ar);
//        int left=0;
//        int right=ar.length-1;
//        while (left<right){
//            char tmp=ar[right];
//            ar[right]=ar[left];
//            ar[left]=tmp;
//            left++;
//            right--;
//        }
//        System.out.println(ar);
//        String ans=new String(ar);
//        int result=Integer.parseUnsignedInt(ans,2);
//        System.out.println(result);
        System.out.println(Integer.toBinaryString(reverseBits(10001)));
    }
    public static int reverseBits(int n) {
        int reversed=0;
        for (int i = 0; i < 32; i++) {
            reversed<<=1;
            reversed+=n&1;
            n>>=1;
        }
        return reversed;
    }
}
