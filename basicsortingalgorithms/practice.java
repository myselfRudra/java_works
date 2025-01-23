package basicsortingalgorithms;

public class practice {
    public static void main(String[] args) {
        
    
    int[] arr={4,3,52,3,1,6};
    int n=arr.length;
    for(int x=0;x<n-1;x++){
        for(int i=0;i<n-1-x;i++){
            if(arr[i]<arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
                  }

    }
    for(int ele:arr){
        System.out.println(ele+" ");
    }

    }    
}
