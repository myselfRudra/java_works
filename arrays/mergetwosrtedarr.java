package arrays;

public class mergetwosrtedarr {
    public static void main(String[] args) {
        int[] a={0,1};
        int[] b={1,2};
        int n=a.length;
        int m=b.length;
        int[] c = new int[m+n];
        int i=0,j=0,l=0;
        while(i<n && j<m){
            if(a[i]<=b[j])
             {
                             c[l]=a[i];
                             i++;
                            }
                        else {
                            c[l]=b[j];
                            j++;                        
                         }
                         l++;

        }
        if (i==n) {
            while(j<m){
                c[l]=b[j];
                l++;
                j++;

            }
            
        }
        if (j==m) {
            while(i<n){
                c[l]=a[i];
                l++;
                i++;

            }
        }
        
        // for(int i=0;i<=n;i++){
        //     for(int j=0;j<=m;j++){
        //         for(int k=0;k<m+n;k++){
        //         if (arr1[i]<arr2[j]) {
        //             c[k]=arr1[i];
                                        
        //         }
        //         else if (arr1[i]>arr2[j]) {
        //             c[k]=arr1[j];
                                        
        //         }
        //         if (arr1[i]==arr2[j]) {
        //             c[k]=arr1[i];
                                        
        //         }
        //     }
        //     }
        // }
        for(int ele:c){
            System.out.print(ele+" ");
        }
    }
    
}
