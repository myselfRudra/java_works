package conditionals;
import java.util.Scanner;
public class switc{
    public static void main(String[] args) {
        Scanner swt=new Scanner(System.in);
        int x=swt.nextInt();
        int y=swt.nextInt();
        char op = swt.next().charAt(0);
        switch (op){
            case'+':
            System.out.println(x+y);
            break;
            case'-':
            System.out.println(x-y);
            break;
            case'*':
            System.out.println(x*y);
            break;
            case'/':
            System.out.println(x/y);
            break;
        }


        
    }
    
}
