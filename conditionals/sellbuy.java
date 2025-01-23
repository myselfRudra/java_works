package conditionals;
import java.util.Scanner;
public class sellbuy {
    public static void main(String[] args) {
        Scanner sell=new Scanner(System.in);
        System.out.println("x");
        int xb=sell.nextInt();
        System.out.println("y");
        
        int ys=sell.nextInt();
        if(xb>ys) System.out.println("loss by "+(xb-ys));

        else System.out.println("profit "+(ys-xb));
    }
    
}
