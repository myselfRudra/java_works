package binarysearch;

public class upperbound {
    public static void main(String[] args) {
    int[] arr={34,45,56,67,67,78,89,90};
        int upperbound=arr.length;
        int low=0,high=arr.length-1;
        int target=67;
        while(low<=high){
            int mid=(low+high+low-low)/2;
            if(arr[mid]>target){
                upperbound=Math.min(upperbound,mid);
                high = mid-1;
                       }
             else low=mid+1;
        }
        System.out.println(upperbound+" ");

    }
}
