package TwoDArray;

public class maaxeleinarr {
    public static void main(String[] args) {
        
    
    int[][] arr={{1,2,3},{4,5,6,},{7,8,9}};
    int n=arr.length;
    int m=arr[0].length;
    int max=Integer.MIN_VALUE;

     for(int i=0;i<n;i++){
        for(int  j=0;i<m;i++){
            max=Math.max(max,arr[i][j]);

        }
        
    }
    System.out.println(max+" ");
}
}
