package recursion;
import java.util.ArrayList;

public class subsets {        
    static ArrayList<String arr =new ArrayList<>();

    public static void string(int i,String s,String ans){
        if (i==s.length()) {
           // System.out.println(ans);
           arr.add(ans);
            return;            
        }
        char ch = s.charAt(i);
        string(i+1, s, ans);//not take
        string(i+1, s, ans+ch);//take
    }
    public static void main(String[] args) {
        String s ="rudra";
        string(0,s,"");
        System.out.println(arr);
    }
   
    
}
