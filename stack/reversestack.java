package stack;
import java.util.Stack;
public class reversestack {
   
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(10);
        st.push(32);
       Stack<Integer> st2=new Stack<>();
       while(!st.isEmpty()){
        st2.push(st.pop());
       }
       System.out.println(st);
       System.out.println(st2);
    
}

    
}
