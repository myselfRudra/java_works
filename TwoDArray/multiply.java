package TwoDArray;

import java.util.Scanner;

public class multiply{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n= sc.nextInt();
        System.out.println("enter m");
        int m= sc.nextInt();
        int [][] arr =new int[n][m];
        n=arr.length;
        m=arr[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter n");
        int p= sc.nextInt();
        System.out.println("enter m");
        int q= sc.nextInt();
        int [][] arr1 =new int[p][q];
        p=arr1.length;
        q=arr1[0].length;
        for(int i=0;i<p;i++){
            for(int j=0;j<q;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        if(arr[0].length==arr1.length) {
        int[][] arr2 =new int[arr[0].length][arr1.length];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                for(int k=0;k<arr1.length;k++){
                    // for(int k=0;k<arr[0].length;k++){ above line and this is same as the arr[0].length = arr1.length..
                   
                    arr2[i][j]+=(arr[i][k]*arr1[k][j]);
                    
                
                }
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
    }
    else{
        System.out.println("not possible");
    }
       
    }
    
}
