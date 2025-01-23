package basicsortingalgorithms;

import project.main;

public class transformareay {
    public static void main(String[] args) {
        int[] arr={3,6,2,4,74,3};
        int n=arr.length;
        int x=0;
        for(int i=0;i<n;i++){
            int min=Integer.MAX_VALUE;
            int mint=0;
           for(int j=0;j<n;j++){
                if(arr[j]<min && arr[j]>0){
                    min = arr[j];
                    mint = j;
                }                
            }
            arr[mint]=x;//...........to avoid getting minimum elements as o,1 it is used as negetive and in loop condition is given it must be greater than 0;
            x--;
        }
    
        for(int ele:arr){
           ele*=-1;
           System.out.print(ele+" ");
        }
    }
    
}
