package arrays;
import java.util.Arrays;
public class copyanarray {
    public static void main(String[] args) {
        int[] arr={12,34,345,2,3423,4123};
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
// Arrays.sort(arr);
// for(int ele : arr){
//     System.out.println(ele+"");
// }
        int[] nums = arr; // shallo0w copy;no new arrays are formed only a new name is assigned
        for(int ele : nums){
            System.out.print(ele+" ");
        }
        System.out.println();
        // int[] brr=Arrays.copyOf(arr,arr.length);//deep copy;does not chnge with the change in the prev arrays if chnge is done in this loop
        // brr[0]=98765;
        // // for(int ele : brr){   //.........................WAY1
        // //     System.out.print(ele+" ");
        // System.out.print(arr[0]+" ");
        int[] crr = new int[arr.length];//..............WAY 2 FOR DEEP COPY
        for(int i=0;i<arr.length;i++){
            crr[i]=arr[i];

        }
        for(int ele : nums){
            System.out.print(ele+" ");
        }
      }

}
