package BitWise;

public class MagicNo {
    public static void main(String[] args) {
        System.out.println(findMagicNo(6));
    }

    private static int findMagicNo(int i) {
        int ans=0;
        int base=5;
        while(i>0){
            int last = i & 1;
            i=i>>1;
            ans+=last*base;
            base=base*5;
        }
        return ans;
    }
}
