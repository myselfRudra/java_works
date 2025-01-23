package basicsortingalgorithms;

public class selectionsort {
    public static void main(String[] args) {
        int[] arr = {1,-3,-4,2,7,-6,6};
        int n= arr.length;
        
        for(int i=0;i<n-1;i++){
            int mintj=0;
           int min=Integer.MAX_VALUE; 
            for(int j=i;j<n;j++){
                if(arr[j]<min){
                    min=arr[j];                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
                     mintj=j;
                }
            }
            int temp= arr[i];
            arr[i]=arr[mintj];
            arr[mintj]=temp;

        }
        for(int ele:arr){
            System.out.println(ele+" ");
        }
    }
    
}
