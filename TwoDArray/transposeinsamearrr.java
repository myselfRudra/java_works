package TwoDArray;

public class transposeinsamearrr {
    public static void main(String[] args) {
        int[][] arr ={{1,2,3},{4,5,6},{7,8,9}};
        int n=arr.length;
        int m =arr[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                int x=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=x;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    
}
}