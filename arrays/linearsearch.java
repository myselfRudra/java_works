package arrays;
import java.util.Scanner;
public class linearsearch {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("entr no");
        int n=sc.nextInt();
        System.out.println("enter trgt ");
        int x=sc.nextInt();
        int[] arr = new int[n];44
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        } 
        boolean flag = false;
        for(int i=0;i<n;i++){
            if (arr[i]==x){
            flag = true;
            break;
            }
          
        }
        if(flag==true) System.out.println("exst");
        else System.out.println("dn xst");
    }
}
