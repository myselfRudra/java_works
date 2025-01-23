package stack;
import java.util.Stack;

public class reverserecursive {
    public static void revst(Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }
        int top = st.pop();
        //revst(st);//same order
        System.out.println(top);
        revst(st);//rev order
        st.push(top);

    }
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
         revst(st);
       
    }
    
}
