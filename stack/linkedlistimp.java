package stack;
import java.util.Stack;
public class linkedlistimp {
    public static class node
    {
        int val;
        node next;
        node(int val){
            this.val=val;
        }
    }
  
    public static class Stack{
       node head = null;
       int size =0;
       void push(int x){
        node temp = new node(x);
        temp.next=head;
        head=temp;
        size++;
       } 
       int size(){
            return size;
        }
        int pop(){
            if(head==null){
                System.out.println("empty");
                return -1;
            }
            int x = head.val;
            head=head.next;
            size--;
            return x;
        }
        int peek(){
            if(head==null){
                System.out.println("empty");
                return -1;
            }
            int x= head.val;
            return x;
        }
        boolean isEmpty()
        {
            if(size==0)
            return true;
            else 
            return false; 
        }

        void display(){
           displayrec(head);
            
        }
        void displayrec(node h){
            if(h==null)
            return;
            displayrec(h.next);
            System.out.println(h.val);
        }

    }

    public static void main(String[] args) {
Stack st=new Stack();
       st.push(1);
        st.push(2);
        st.push(3);
        st.push(40);
       System.out.println(st.peek());
       System.out.println(st.size());
       System.out.println(st.pop());
      st.display();
     }

   
}

    

