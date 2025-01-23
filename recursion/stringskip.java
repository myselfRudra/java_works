package recursion;

public class stringskip {
    public static void skip(int i,String s,String ans){
        if(i==s.length()){
            System.out.print(ans);
            return;
        }
        if(s.charAt(i)!='a') ans+=s.charAt(i);
        skip(i+1,s,ans);
    }
    public static void main(String[] args) {
        String s="rudra khan";
        skip(0,s,"");
    }
    
}
