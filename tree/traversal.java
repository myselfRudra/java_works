package tree;

import java.util.LinkedList;
import java.util.Queue;

import TwoDArray.rowandcolwisetranspose;
import string.indexof;

public class traversal {
    static int n;
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
        preorder(a);
        System.out.println();
        inorder(a);
        System.out.println();
        postorder(a);
        System.out.println();
        levelorder(a);
        System.out.println();
        for(int x=0;x<=3;x++){
            n=x;
            nthelevelord(a, 0);
            System.out.println();
        }


    }
    private static void nthelevelord(Node root,int level){//..........level order way 2
        if(root== null) return;
        if(level==n) System.out.print(root.val+" ");
        nthelevelord(root.left, level+1);
        nthelevelord(root.right,level+1);
    }
    public static void levelorder(Node root){//...........level order way 1
        Queue<Node> q = new LinkedList<>();
        if(root!=null) q.add(root);
        while(q.size()>0){
            Node front = q.remove();
            System.out.print(front.val+" ");
            if (front.left!=null) q.add(front.left);
            if (front.right!=null) q.add(front.right);
        }
    }
    public static void preorder(Node root){
        if(root==null ) return;
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Node root){
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);

    }
    public static void postorder(Node root){
        if(root== null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val+" ");
    }
    
}
