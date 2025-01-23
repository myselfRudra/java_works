package Linked_List;

public class shallowcopy {
    public static void main(String[] args) {
        node a =new node(100);
        node temp = a;// shallow copy of a 
        //node temp = new node(100);// deep copy
        System.out.println(a.val);
        System.out.println(temp.val);
        temp.val=12;
        System.out.println(a.val);

    }
    
}
