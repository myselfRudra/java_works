package TwoDArray;

public class rowandcolwisetranspose {
    public static void main(String[] args) {
        int[][] arr ={{1,2},{4,5},{7,8}};
        int n=arr.length;
        int m =arr[0].length;
        // for(int i=0;i<n;i++){//////....................row wise;first i and then j
        //     for(int j=0;j<m;j++){
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }
       
        for(int j=0;j<m;j++){//.......................column wise;transpose;1st j and then i
            for(int i=0;i<n;i++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
    }
    int[][] transpose = new int[m][n];//..................storing in new arr
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            transpose[i][j]=arr[j][i];

            System.out.print(transpose[i][j]+" ");
        }
        System.out.println();
    }
}
}
