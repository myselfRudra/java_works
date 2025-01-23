package arrays;

public class sortcolorsveryveryimportant {
    public static void main(String[] args) {
        int[] arr ={0,2,1,0,2,0,0,0,1,1,1,0,2,0,2,1,2,2,1,2,1};
        // int n=arr.length;...//...............................WAY 1 USING MULTIPLELOOPS 
        // int noofzero=0;int noofone=0;
        // for(int i=0;i<n;i++){
        //     if(arr[i]==0)  noofzero++;
            
        // }
        // for(int i=0;i<n;i++){
        //     if(arr[i]==1)  noofone++;
            
        // }
        // for(int i=0;i<n;i++){
        //     if(i<noofzero && i<noofone) arr[i]=0;
        //     else if (i<noofone+noofzero) arr[i]=1;
        //     else arr[i]=2;

                
        //     }
        //      for(int i=0;i<n;i++){
        //         System.out.print(arr[i]+" ");
        // }
        int n=arr.length;
        int mid =0; int low =0;int high=n-1;
        while(mid<=high){
            if (arr[mid]==0) {
              int x=arr[mid];
              arr[mid]=arr[low];
              arr[low]=x;
              low++;mid++;
            }           
            if (arr[mid]==1) {
              mid++;
              }          
              if (arr[mid]==2) {
                int x=arr[mid];
                arr[mid]=arr[high];
                arr[high]=x;
                high--;
              }           

        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    
}
}