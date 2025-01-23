package hashset_hashmaps;

import java.util.HashSet;

public class hashsets {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(54);
        set.add(893829);
        set.add(-1);
        System.out.println(set);
        System.out.println(set.contains(20));
        System.out.println(set.contains(-1));
        System.out.println(set.size());
        set.remove(1);
        System.out.println(set);
        Object[] arr = set.toArray();
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }        
}
