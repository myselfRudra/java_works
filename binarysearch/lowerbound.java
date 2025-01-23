package binarysearch;

public class lowerbound {
    public static void main(String[] args) {
        int[] arr={34};
        int lowerbound=arr.length;
        int low=0,high=arr.length-1;
        int target=34;
        while(low<=high){
            int mid=(low+high+low-low)/2;
            if(arr[mid]>=target){
                lowerbound=Math.min(lowerbound,mid);
                high = mid-1;
                       }
             else low=mid+1;
        }
        System.out.println(lowerbound+" ");

    }
    
}
