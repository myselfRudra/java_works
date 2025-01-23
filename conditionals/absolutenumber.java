package conditionals;
import java.util.Scanner;
public class absolutenumber {
    public static void main(String[] args) {
        Scanner abs =new Scanner(System.in);
        int x = abs.nextInt();
        if(x<0) System.out.println(-x);
        else System.out.println(x);
        
    }
}
