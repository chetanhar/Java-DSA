package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;

public class Subsets {
    public static void main(String[] args) {
        int[] input={1,2,2};
        ArrayList<Integer> ar=new ArrayList<>();
        subset(input,0,ar);
    }
    public static void subset(int[] input,int i,ArrayList<Integer> currentOutput){
        if(i==input.length){
            System.out.println(currentOutput);
            return;
        }
        currentOutput.add(input[i]);
        subset(input,i+1,currentOutput);
        currentOutput.remove(currentOutput.size()-1);
        int j=i+1;
        while (j<input.length&&input[j]==input[j-1]){
            j++;
        }
        subset(input,j,currentOutput);
    }
}
