package stack;
import java.util.Stack;
public class arrimplement {
    public static class Stack{
        private int[] arr = new int[5];
        private int idx=0;
        boolean isfull(){
            if(arr.length==idx) return true;
            else return false;          
        }

        boolean isEmpty(){
            if(idx==0) return true;
            return false;
        }
        int pop(){
            if(isEmpty()){
                System.out.println("empty");
            return -1;
        }
        int top= arr[idx-1];
        arr[idx-1]=0;
        idx--;
            return top;
        }
        void push(int x){
            if(isfull()){
                System.out.println("is full");
                return;
            }
            arr[idx]=x;
            idx++;
        }
      int peek() {
        if(idx==0){
            System.out.println("is empty");
            return -1;

        }
        return idx;

      }
     void display(Stack st){
        for(int i=0;i<=idx-1;i++){
            System.out.print(arr[i]);
        }
      }
      int size(){
        return idx;
      }
    }

    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(40);
       System.out.println( st.peek());
        System.out.println(st.pop());
        System.out.println(st.size());
       st.display(st);
    }

   
}
