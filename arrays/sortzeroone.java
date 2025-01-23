package arrays;

public class sortzeroone {
    public static void main(String[] args) {
        int[] arr = {1,0,0,0,0,1,1,1,0,1,0,0,0};
        int n=arr.length;
        int noozeroes=0;
        // for(int i=0;i<n;i++){ //....................using 2 lopp ; way 1
        //     if(arr[i]==0) noozeroes++;
        // }
        // for(int i=0;i<n;i++){
        //     if(i<noozeroes) arr[i]=0;
        //     else arr[i]=1;
        
        // }
        // for(int i=0;i<n;i++){
        //     System.out.print(arr[i]+" ");
        // }
        int i=0,j=n-1;
        while(i<j){
            if(arr[i]==0) i++;
            else if(arr[j]==1) j--;
         //   if (i>j)     break;//..............it is done to prevent the error occur while the total no.o elemts are even no. and the middle two elemnt gets swapped again due to continuation of the array
           else if (arr[i]==1 && arr[j]==0) {
                // int temp=arr[i];
                // arr[i]=arr[j];
                // arr[j]= temp; .............//or 
                arr[i]=0;
                arr[j]=1;
                i++;
                j--;
                
            }
        }
            for(int ele:arr){
                System.out.print(ele+" ");
            }
        }
    }
    

