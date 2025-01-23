package Basics;
import java.util.Scanner;
public class halfusingtypecasting {
    public static void main(String[] args) {
        // Scanner doubl = new Scanner(System.in);
        // System.out.println("enter x");
        // int x=doubl.nextInt();
        // double y = (double)x;
        // System.out.print(y/2);
        Scanner int1 = new Scanner(System.in);
        System.out.println("enter x");
        double x=int1.nextDouble();
        int y = (int)x;
        System.out.print(y/2);
    }
    
}
