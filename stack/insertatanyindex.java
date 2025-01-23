package stack;
import java.util.Stack;
public class insertatanyindex {
  
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);
        int nele=50;
        int pos=2;
        Stack<Integer> temp=new Stack<>();
        while(st.size()>=pos){
            temp.push(st.pop());
        }
        st.push(nele);
        while(!temp.isEmpty()){
            st.push(temp.pop());            
        }
        System.out.println(st);
    }
}


