package hashset_hashmaps;

import java.util.HashMap;

public class mapsbasic {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("rudra",97);
        map.put("rudr", 99);
        map.put("rud", 99);
        map.put("ru", 99);
        System.out.println(map);
        System.out.println(map.containsKey("rudra"));
        System.out.println(map.containsValue(97));
        System.out.println(map.get("rudra"));
        


    }
    
}
