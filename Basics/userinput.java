package Basics;

import java.util.Scanner;

public class userinput {
    public static void main(String[] args) {
        Scanner rud = new Scanner(System.in);
        System.out.print("enter the no.");
        int n = rud.nextInt();
        System.out.println(n*n);
    }
    
}
