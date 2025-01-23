package arrays;

public class nextgrtrele {
    public static void main(String[] args) {
        int[] arr={2,54,5,5,23,23,5,67,87,65,34};
        int n = arr.length;
        int[] ans= new int[n];
        ans[n-1]=-1;
        // for(int i=0;i<n-1;i++){
        //     int mx=Integer.MIN_VALUE;
        //     for(int j=i+1;j<n;j++){
        //         mx=Math.max(mx, arr[j]);
        //     }
        //     ans[i]=mx;
        // } 
         int max=arr[n-1];
        for(int i=n-1;i>=0;i--){
          
            max=Math.max(max, arr[i]);
           ans[i]=max;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }

    }
    
}
