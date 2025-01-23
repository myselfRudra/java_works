package TwoDArray;

public class spiralprint {
    public static void main(String[] args) {
        
    
    int[][] arr ={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
        int n=arr.length;
        int m =arr[0].length;
        int minr=0,minc=0,maxr=n-1,maxc=m-1;
        while(minr<=maxr && minc<=maxc){
            for(int j=minc;j<=maxc;j++){
                System.out.print(arr[minr][j]+" ");
               
            }
             minr++;
             if (minr>maxr || minc>maxc) break;
                
             
            for(int i=minr;i<=maxr;i++){
                System.out.print(arr[i][maxc]+" ");
                
            }
            maxc--;
            if (minr>maxr || minc>maxc) break;
            for(int j=maxc;j>=minc;j--){
                System.out.print(arr[maxr][j]+" ");
              
            } 
             maxr--;
             if (minr>maxr || minc>maxc) break;
            for(int i=maxr;i>=minr;i--){
                System.out.print(arr[i][minc]+" ");
                
            }

            minc++;
            if (minr>maxr || minc>maxc) break;
            
        }

    }
}
