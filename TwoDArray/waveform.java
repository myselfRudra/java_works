package TwoDArray;

public class waveform {
    public static void main(String[] args) {
        int[][] arr ={{1,2},{4,5},{7,8}};
        int n=arr.length;
        int m =arr[0].length;
        for(int[] ele:arr){
            for(int x:ele){
                System.out.print(x+" ");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            if(i%2==0 || i==0){
                for(int  j =0;j<m;j++){
                    System.out.print(arr[i][j]+" ");

                }
            }
                else{
                    for(int j = m-1;j>=0;j--){
                        System.out.print(arr[i][j]+" ");
                    }
                }
            
        }
    }
    
}
