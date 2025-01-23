package recursion;

import java.util.Scanner;

public class vvimazepath {
    public static int maze(int row,int col,int m,int n){
        if (row==m || col==n) {
            return 1;
        }
        int rightway=maze(row, col+1, m, n);
        int leftway=maze(row+1, col, m, n);
        return rightway+leftway;
    }
    public static int maze2(int m,int n){
        if (m==1|| n==1) {
            return 1;
        }
        int rightway=maze2(m,n-1);
        int leftway=maze2(m-1, n);
        return rightway+leftway;
    }
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
            int n =sc.nextInt();
            int m =sc.nextInt();
            System.out.println(maze2(m, n));
    
}
}
