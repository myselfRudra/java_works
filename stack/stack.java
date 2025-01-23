package stack;
import java.util.Stack;
public class stack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(10);
        st.push(32);
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.size());
        st.push(10);
        st.push(32);
        while(st.size()>1){
            st.pop();

        }
        System.out.println(st.peek());
        System.out.println(st);
    }
    
}
