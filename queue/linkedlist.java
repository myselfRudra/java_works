package queue;

public class linkedlist {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val= val;
            this.next=null;
        }
            }
    public static  class quell{
        Node head = null;
        Node tail= null;
        int size = 0;
        public  void add(int x){
                   Node temp = new Node(x);
                    if(size == 0){
                    head = tail= temp;
                        }      
                    else{
                        tail.next= temp;
                        tail=temp;
                    }
                    size++;
                }
                public void drop(int x){
                    if(size==0){
                        return;
                    }
                    else{
                        head = head.next;
                     }
                     size--;
                }
                public int peek(){
                    if(size == 0){
                        System.out.println("empty");
                        return -1;
                    }
                    else{
                        return head.val;
                    }
                }
                public void display(){
                    if(size == 0){
                        return;
                    }
                    else{
                        Node temp = head;
                        while(temp!=null){
                            System.out.println(temp.val);
                            temp = temp.next;
        
                        }
                        System.out.println();
                    }
                }
                public static void main(String[] args) {
                    quell q = new quell();
                    q.add(4);
                    q.add(5);
                    q.add(6);
                    q.add(7);
                    q.drop(6);
                    q.display();            
        }
    }
}
