package PracticeExamples;

public class CountZeros {
    public static void main(String[] args) {
        int num=3004056;
        //countZeroes(num);
        System.out.println(countZeroes(num));
    }

    private static int  countZeroes(int num) {
        String nu=Integer.toString(num);
        int[] ar=new int[nu.length()];
        for (int i = 0; i < nu.length(); i++) {
            ar[i]=Character.getNumericValue(nu.charAt(i));
        }
        int count=0;
        for (int i = 0; i < ar.length; i++) {
            if(ar[i]==0){
                count++;
            }
        }
        return count;
    }
}
