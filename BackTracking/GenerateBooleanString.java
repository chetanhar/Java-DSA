package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;

public class GenerateBooleanString {
    public static void main(String[] args) {
        int n=3;
        ArrayList<Integer[]> arlist=new ArrayList<>();
        Integer[] output=new Integer[n];
        generateBoolean(n,0,output,arlist);
        for (Integer[] ar:
                arlist) {
            System.out.println(Arrays.toString(ar));
        }

    }

    private static void generateBoolean(int n, int i, Integer[] output,ArrayList<Integer[]> arlist) {
        if(i==n){
            arlist.add(output.clone());
            //System.out.println(Arrays.toString(output));
            return;
        }
        output[i]=0;
        generateBoolean(n,i+1,output,arlist);
        output[i]=1;
        generateBoolean(n,i+1,output,arlist);
    }
}
