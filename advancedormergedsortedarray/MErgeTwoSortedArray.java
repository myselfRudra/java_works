package advancedormergedsortedarray;

public class MErgeTwoSortedArray {
    public static void print(int[] arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(i+"");

        

    }
    
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

    
    public static void main(String[] args) {
        int[] a = {10,20,30,40};
        int[] b={29,49,100};
        print(a);
        int[] c=new int[a.length+b.length];
        merge(a,b,c);
        print(c);

    }
    
}
