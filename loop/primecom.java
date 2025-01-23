package loop;
import java.util.Scanner;
public class primecom {
    public static void main(String[] args) {
        Scanner xxx=new Scanner(System.in);
        int n = xxx.nextInt();

        int x=0;
        for(int i=2;i<=n-1;i++){
            if(n%i==0){

            System.out.println("comp");
             x=1;
          
            break;
            }
        }
        
        if(x==0) System.out.println("prime");
            
        
    }
    
}
