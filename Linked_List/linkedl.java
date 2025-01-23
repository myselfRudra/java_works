package Linked_List;
class node{
        int val;
        node next;
        node(int val){
            this.val=val;
        }
    }
public class linkedl {  //using recurssion
    public static void recurssivehead(node head){
        if(head==null) return;
        System.out.println(head.val);
        recurssivehead(head.next);
        
    }
    public static void print(node head){
         node temp =head ;
        while(temp!=null){
            System.out.println(temp.val);
            temp = temp.next;

        }

    }
    
    public static void main(String[] args) {
        node a=new node(1);
        node b=new node(2);  
        node c=new node(3);
        node d=new node(4);
        a.next=b;
        b.next=c;
        c.next=d;
        recurssivehead(b);
        // System.out.println(a.val);
        // System.out.println(a.next.val);//print value of b
               
        // System.out.println(a.next.next.val);//print val of cs
        // node temp = a;
        // System.out.println(temp.val);
        // temp=temp.next;
        // System.out.println(temp.val);
               
        // node temp =a ;
        // while(temp!=null){
        //     System.out.println(temp.val);
        //     temp = temp.next;

        // }
              
    }
    
}
