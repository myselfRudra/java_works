package binarysearch;
import java.util.Scanner;
public class basics {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr ={1,2,3,4,5,6,7,8};
        int low=0,high= arr.length-1;
        int target=sc.nextInt();
        boolean flag = false;
              while(low<=high){
            int mid=(low+high+low-low)/2;
            if(arr[mid]<target) low=mid+1;
            else if(arr[mid]>target) high=mid-1;
            else if(arr[mid]==target) {
                flag = true;
                break;
            }
             }
             if(flag==true) {
                System.out.println("exists");
                            }
             else if(flag==false){
                System.out.println("doesnt");
            } 
    }
    
}
