package arrays;
import java.util.Scanner;
public class maxinaerry {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("ntr no");
        int n=sc.nextInt();
        int[] arr= new int[n];
        System.out.print("ntr digits");
        System.out.println();
        for(int i=0;i<n;i++){
          
            arr[i]=sc.nextInt();
    }
    // int max=arr[0];      //way 1
    // for(int i=0;i<n;i++){
    //     if (max<arr[i])
    //     {
    //         max=arr[i];
    //         System.out.println(max+"");
    ///////way 2.......................................
    int max=arr[0];
    for(int i=0;i<n;i++){
        if (max<arr[i])
        {
            max=arr[i];
            System.out.println(max+"");
        }}
        int smax=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if (arr[i]!=max && arr[i]>smax)
            {
                smax=arr[i];
                System.out.println(smax+"");
            }
        }
        System.out.println("Maximum element is: " + max);
        if(smax == Integer.MIN_VALUE){
            System.out.println("There is no second maximum element.");
        } else {
            System.out.println("Second maximum element is: " + smax);
        }
            
        
}
}