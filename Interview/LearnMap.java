package Interview;

import java.util.HashMap;
import java.util.Map;

public class LearnMap {
    public static void main(String[] args) {
        Map<String,Integer> mp=new HashMap<>();
        mp.put("one",1);
        mp.put("two",2);
        mp.put("four",4);
        mp.put("three",3);
        mp.putIfAbsent("five",6);
        mp.put("three",3);
        //System.out.println(mp);
//        for (Map.Entry<String,Integer> es:
//             mp.entrySet()) {
//            System.out.println(es);
//            System.out.println(es.getKey());
//            System.out.println(es.getValue());
//
//        }
        mp.remove("two");
        for (String key:
             mp.keySet()) {
            System.out.println(key);
        }
        for (Integer val:
             mp.values()) {
            System.out.println(val);
        }
        System.out.println(mp.containsValue(2));
        System.out.println(mp.containsKey("one"));
        System.out.println(mp.isEmpty());
        mp.clear();
        System.out.println(mp);
    }
}
