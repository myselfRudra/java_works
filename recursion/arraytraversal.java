package recursion;

public class arraytraversal {
    public static void print(int i,int[] arr){
        if(i==arr.length) return;
        System.out.print(arr[i]+" ");
        print(i+1, arr);
    }
    public static void main(String[] args) {
        int[] arr= {4,1,3,6,8,5,0,3,4};
        print(0,arr);
    }    
}
