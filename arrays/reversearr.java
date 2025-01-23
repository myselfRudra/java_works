package arrays;

public class reversearr {
    public static void main(String[] args) {
        int[] arr = {2,3,5,6,8,4,7,6};
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
         for(int i=0;i<arr.length/2;i++){ //...............................WAY 1
             int j=arr.length-1-i;
           
            int x=arr[i];
             arr[i]=arr[j];
             arr[j]=x;
        
       
         }
        
            for(int ele : arr){
               System.out.print(ele+" ");
            
     }
    }
    
}
