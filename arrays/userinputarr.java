package arrays;
import java.util.Scanner;
public class userinputarr {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("ntr no");
        int n=sc.nextInt();
        int[] arr= new int[n];
        System.out.print("ntr digits");
        System.out.println();
        for(int i=0;i<5;i++){
          
            arr[i]=sc.nextInt();

            
        }
        for(int i=0;i<5;i++){
        
            
    
        System.out.print(arr[i]+" ");
    }
}
}