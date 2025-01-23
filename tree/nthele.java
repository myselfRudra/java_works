package tree;

import java.util.Scanner;

public class nthele {
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node a = new Node(1);
        Node b =new Node(2);
        Node c =new Node(3);
        Node d =new Node(5);
        Node e =new Node(16);
        Node f =new Node(16);
        a.left=b;a.right =c;
        b.left=d;b.right=e;
        c.right=f;     
        System.out.println("ntr n");
        n=sc.nextInt();   
        nthele(a,0);
        
    }
    private static void nthele(Node root,int level){
        if(root== null) return;
        if(level==n) System.out.print(root.val+" ");
        nthele(root.left, level+1);
        nthele(root.right,level+1);
    }
    
}
