package arrays;
import java.util.Arrays;

public class arraylist2withoutor {
   
    public static void main(String[] args) {
        int[] arr={131,23,345,2,35};
        for(int ele : arr){ //int ele in array arr;it will print all elements in the array one after one
            System.out.println(ele+"");
        }
        
        Arrays.sort(arr);
        for(int ele : arr){
            System.out.println(ele+"");
    
}
}
}
