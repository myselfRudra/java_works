package Basics;
import java.util.Random;
public class sd {
    
   
   
        public static void main(String[] args) {
            int min = 10;
            int max =100;
            Random x = new Random();
            int y=x.nextInt((max-min)+1)+min;
            // int y=x.nextInt(10);//10 is udes to bound the size 
            //and + min is done to generate from the min value instead of zero
            System.out.println(y);
        }
        
    }
    
    

