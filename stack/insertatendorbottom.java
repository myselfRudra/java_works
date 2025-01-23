package stack;
import java.util.Stack;
public class insertatendorbottom {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);
        Stack<Integer> temp=new Stack<>();
        while(!st.isEmpty()){
            temp.push(st.pop());
        }
        st.push(50);
        while(!temp.isEmpty()){
            st.push(temp.pop());            
        }
        System.out.println(st);
    }
}
