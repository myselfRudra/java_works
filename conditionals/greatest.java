package conditionals;
import java.util.Scanner;
public class greatest {
    // public static void main(String[] args) {    //with &&
    //     Scanner gr = new Scanner(System.in);
    //     int x=gr.nextInt();
    //     int y=gr.nextInt();
    //     int z=gr.nextInt();
    //     if(x>y&&x>z) System.out.println(x+" is greater");
    //     else if(y>x&&y>z) System.out.println(y+" is greater");
    //     else System.out.println(z+" is greater");
    // }
    public static void main(String[] args) {     //without &&
        Scanner gr = new Scanner(System.in);
            int x=gr.nextInt();
             int y=gr.nextInt();
             int z=gr.nextInt();
             if(x>y){
                if(x>z)
                System.out.println(x+"is the greatest");
             }
             else if(y>x){
                if(y>z)
                System.out.println(y+"is the greatest");
             }
             else System.out.println(z+"is the greatest");
        
    }
}
