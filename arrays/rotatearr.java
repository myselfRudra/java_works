package arrays;

public class rotatearr {
    static void reverse(int[] arr ,int i,int j){
        for(;i<=j;i++,j--){
          // while(i<=j){
            int temp =arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        //    i++;
        //    j--;


        }
        System.out.println();
        for( int ele : arr){
            System.out.print(ele+" ");

        }
    }
    public static void main(String[] args) {
        int[] arr={1,3,4,5,6,3,2};
        int n=arr.length;
        int k=3;
        k=k%n;
         reverse(arr,0,n-k-1);
         reverse(arr, n-k, n-1);
         reverse(arr, 0, n-1);
    }
    
}
