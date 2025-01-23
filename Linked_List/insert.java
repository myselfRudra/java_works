package Linked_List;
class SLL{
    node head;
     node tail;
     int size;
     void insertany(int idx, int val){
        if(idx==0){
            insertathead(val);
            return;
            
        }
        if(idx==size){
            insertatend(val);
            return;
        }
        if(idx>size){
            System.out.println("invalid");
            return;
            
        }
        node temp =new node(val);
        node x=head;
        for(int i=0;i<idx-1;i++){
            x=x.next;
        }
        temp.next=x.next;
        x.next=temp;
        size++;
     }
     void insertatend(int val){
        node temp =new node(val);
        if(head==null) head=tail=temp;
        else{
            tail.next=temp;
            tail=temp;

        }   
        size++;//counts the size             
    }
    void insertathead(int val){
        node temp = new node(val);
        if(head==null) head=tail=temp;
        else{
            temp.next=head;
            head=temp;
        }
        size++;
    }
    int get(int idx){
        if(idx==0) return head.val;
        if(idx==size-1) return tail.val;
        if(idx>size || idx<0){
            System.out.println("invalid");
            return -1;

        }
        node temp= head;
        for(int i=1;i<=idx;i++){
            temp=temp.next;

        }
        return temp.val;
    }
    void deleteathead() throws Error {
        if(head==null) throw new Error("empty");
        head=head.next;
        size--;
    }
    void deleteatidx(int idx) throws Error {
        if(idx==0){
            deleteathead();
            return;
        }
        if(head==null) throw new Error("empty");
        if(idx>size || idx<0) throw new Error("invalid");
        node temp=head;
        for(int i=0;i<idx-1;i++){
            temp=temp.next;

        }
        if(temp.next==tail) tail=temp;
        temp.next=temp.next.next;
        size--;
    }

 void print(){
        node temp= head;
        while(temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }
    }
    void size(){
        System.out.println(size);
    }
}
public class insert {
    
    public static void main(String[] args) {
        SLL s=new SLL();
        s.insertatend(10);
        s.insertatend(20);
        s.insertatend(30);
        s.insertatend(40);
        s.insertatend(50);
       // s.print();
        // s.insertatend(60);
        // s.print();
        // s.size();
        // s.insertathead(50);
        // s.size();
        // s.insertany(8,39);
        // s.print();
        // s.size();
       // System.out.println(s.get(-1));
       
        s.deleteatidx(4);
        s.print();
        s.size();
        System.out.println(s.tail.val);



    }

    
}
