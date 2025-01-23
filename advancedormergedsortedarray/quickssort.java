package advancedormergedsortedarray;

public class quickssort {
    public static void swap(int[]arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static int partition(int[] arr,int lo,int hi){
        int scount=0;
        int pivot=arr[lo];
        for(int i=lo+1;i<=hi;i++){
            if(arr[i]<=pivot) scount++;
        }
        int corindx=lo+scount;
        swap(arr, lo, corindx);
        int i=lo,j=hi;
        while(i<corindx && j>corindx){
            if(arr[i]<=pivot) i++;
            else if(arr[j]>pivot) j--;
            else if(arr[i]>pivot && arr[j]<=pivot){
                swap(arr, i, j);
            }
        }
        return corindx;
    }
    public static void quicksort(int[] arr,int lo,int hi) {
        if(lo>=hi) return;
        int idx=partition(arr,lo,hi);      
        quicksort(arr, lo, idx-1);
        quicksort(arr, idx+1, hi);  
    }
    public static void print(int[] arr){
        for(int ele:arr){
            System.out.println(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={20,23,5,42,75,4,8,1,3};
        int n=arr.length;
        print(arr);
        quicksort(arr,0,n-1);
        print(arr);
        
    }
    
}
