package arrays;

public class arrsumdoublet {
    public static void main(String[] args) {
        int[] arr = {2,4,6,7,3,5,1,-1};
        int x=6   ;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if (arr[i]+arr[j]==x) 
                {
                    System.out.println(arr[i] +  " "  +arr[j]);
                    break;
                    
                }
            }
        }
    }
    
}
