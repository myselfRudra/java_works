package basicsortingalgorithms;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {-1,4,-3,6,2,6,1,7,4};
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
            
            // for(int j=i;j>0;j--){//...............we can use for and while both cases 
            //     if(arr[j]<arr[j-1]){
                    int temp=arr[j];                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
                     arr[j]=arr[j-1];
                     arr[j-1]=temp;
                    }
                   // else break;
                
            }
        
                for(int ele:arr){
                    System.out.println(ele+" ");
                }
    
}}

