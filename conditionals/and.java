package conditionals;
import java.util.Scanner;
public class and {
    public static void main(String[] args) {
        Scanner op =new Scanner(System.in);
        int x=op.nextInt();
        if(x>99&&x<1000) System.out.println("yes");
        else System.out.println("no");
    }
    
    
}
