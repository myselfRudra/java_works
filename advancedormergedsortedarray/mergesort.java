package advancedormergedsortedarray;

public class mergesort {
     public static void merge(int[] a,int[] b,int[] c){
     int i=0,j=0,k=0;
     while(i<a.length && j<b.length){
        if(a[i]<=b[j]){
            c[k++]=a[i++];
            
        }
        else{
            c[k++]=b[j++];
            
        }
        
    }

        if(i==a.length){
            while(j<b.length){
            c[k++]=b[j++];
                     
        }}
        if(j==b.length){
            while(i<a.length){
            c[k++]=a[i++];
           
            }      
        }
                
     }

    public static void print(int[] arr){
    for(int ele:arr){
        System.out.print(ele+" ");
    }
    System.out.println();
}
public static void mergesorts(int[] arr){
    int n=arr.length;
    if(n==1) return;
    int[] b= new int[n/2];
    int[] c= new int[n-n/2];
    for(int i=0;i<n/2;i++){
        b[i]=arr[i];
    }
    for(int i=0;i<n-n/2;i++){
        c[i]=arr[i+n/2];
    }
    mergesorts(b);
    mergesorts(c);
    merge(b, c, arr);

}

    public static void main(String[] args) {
        int[] arr={10,37,568,73,1};
        print(arr);
        mergesorts(arr);
        print(arr);
    }
    
}
