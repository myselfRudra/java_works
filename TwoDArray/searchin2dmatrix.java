package TwoDArray;

public class searchin2dmatrix {
    public static void search(int target){
        int[][] arr={{1,4,7,11,15},{2,5,8,19,15},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int n=arr.length;int m=arr[0].length;
        int i=0;int j=m-1;
        boolean found = false;
        while(i<n && j>=0){
            if(arr[i][j]==target){ System.out.println("true");
            found= true;
            break;
        }
            else if(arr[i][j]>target){
            j--;
            }
            else {
                i++;
            }
        }
        if(!found){
        System.out.println("false");}
  
    }
    public static void main(String[] args) {
        search(15);
    }
}
