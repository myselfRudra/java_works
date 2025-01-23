package tree;
    class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val=val;
        }
    }
    public class display {
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
            display(a);
            System.out.println();
            System.out.println(sum(a));
        }
            private static void display(Node root){
                if(root==null) return;
                System.out.print(root.val+" ");
                display(root.left);
                display(root.right);

            }

        private static int sum(Node root){
            if(root==null ) return 0;
            return root.val+sum(root.left)+sum(root.right);
            


        }
        
    
}
