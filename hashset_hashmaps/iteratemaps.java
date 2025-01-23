package hashset_hashmaps;

import java.util.HashMap;

public class iteratemaps {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("rudra",97);
        map.put("rudr", 99);
        map.put("rud", 99);
        map.put("ru", 99);
        for(String key : map.keySet()){
            System.out.println(key+" "+map.get(key));
        }
        System.out.println();
        for(int val : map.values()){
            System.out.println(val);
        }
        System.out.println();
        for(Object pair : map.entrySet()){
            System.out.println(pair);
        }
    }
    
}
