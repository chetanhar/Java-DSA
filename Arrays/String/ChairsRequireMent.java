package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChairsRequireMent {
    public static void main(String[] args) {
    List<String> ls= Arrays.asList("CCRUCL","CRUC","CCC");
    List<Integer> res=minChairs(ls);
        for (int chairs:res
             ) {
            System.out.println(chairs);
        }
    }
    public static List<Integer> minChairs(List<String> simulations) {
        List<Integer> rs=new ArrayList<>();
        for (String simulation : simulations) {
            Integer al=0;
            Integer cp=0;
            for (int i = 0; i < simulation.length(); i++) {
                char el=simulation.charAt(i);
                if(el=='C'){
                    if(al>0){
                        al--;
                    }else{
                        cp++;
                    }
                }else if(el=='R'){
                    al++;
                }else if(el=='U'){
                    if(al>0){
                        al--;
                    }else{
                        cp++;
                    }
                }else if(el=='L'){
                    al++;
                }
            }
            rs.add(cp);
        }
        return rs;
    }
}
