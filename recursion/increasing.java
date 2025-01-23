package recursion;
import java.util.Scanner;
public class increasing {
    public static void print(int n){
        if(n==0) return;   
       
        print(n-1);//...............these two lines are interchanged and they are changed to incr and decreasing 
         System.out.println(n);
    }
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n =sc.nextInt();
            print(n);
        }
    
}
