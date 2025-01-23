package basicsortingalgorithms;

public class bubblesort {
    public static void main(String[] args) {
        int[] arr={5,43,78,3,8};
        int n = arr.length;
        //...........................................way1 with greater time complexity
    //     for(int x=0;x<n-1;x++){//.......bubble sort
    //     for(int i=0;i<n-1;i++){
    //         if (arr[i]>arr[i+1]) {
    //             int temp=arr[i];
    //             arr[i]=arr[i+1];
    //             arr[i+1]=temp;

    //         } 
    //     }
    // }
    for(int x=0;x<n-1;x++){//.......bubble sort way 2
             for(int i=0;i<n-1-x  ;i++){
                if (arr[i]>arr[i+1]) {
            int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
    
                 } 
             }
         }
            for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
                
            
        
    }    
}
