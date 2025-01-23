package arrays;

public class median {
    
        public static void main(String[] args) {
            int[] a ={1,2,3};
            int[] b={5,6,7};


            
        
            int n=a.length;
            int m=b.length;
            int[] c= new int[n+m];
            int i=0,j=0,k=0;
            while(i<n && j<m){
                if(a[i]<=b[j]){
                    c[k]=a[i];
                    i++;
                }
                else {
                    c[k]=b[j];
                    j++;
                }
                k++;
            }
                if(i==n){
                    while(j<m){
                    c[k]=b[j];
                    j++;
                    k++;
                    }
                }
                if(j==m){
                    while(i<n){
                        c[k]=a[i];
                        i++;
                        k++;
    
                    }
                }
             int x=c.length;
             if(x%2==1){
            
                System.out.print((double) c[x/2]);
    
             }  
             else{
                int m1=c[x/2+1];
                int m2=c[x/2];
                System.out.print(((double)m1 + (double)m2)/2.0);
             }
        }
    }
  

