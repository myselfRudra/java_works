package tree;
    class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val=val;
        }
    }
    
   public class implement {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b =new Node(2);
        Node c =new Node(3);
        Node d =new Node(5);
        Node e =new Node(16);
        Node f =new Node(16);
        a.left=b;a.right =c;
        b.left=d;b.right=e;
        c.right=f;
        System.out.println(b.val);
        System.out.println(a.left.val);

    }
   } 
