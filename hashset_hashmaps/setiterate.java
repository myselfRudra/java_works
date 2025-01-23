package hashset_hashmaps;
import java.util.HashSet;
public class setiterate {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(54);
        set.add(893829);
        set.add(-1);
        for(int ele:set){
            System.out.print(ele);
        }
        System.out.println();
        set.clear();
        System.out.println(set);

    }
    
}
