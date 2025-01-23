package project;
import java.util.Random;
import java.util.Scanner;
public class randomnumber {
            public static void main(String[] args) {
               Scanner sc = new Scanner(System.in);
               Random ra = new Random();
               int maxAttempts=5;
               
               int att=0;
               System.out.println("enter the minimum number\n");
               int min = sc.nextInt();
               System.out.println("enter the maximum number\n");
               int max =sc.nextInt();
               int x=ra.nextInt((max-min)+1)+min;
               for(;att<maxAttempts;att++){
                System.out.println("enter the guessed number");
                int guess = sc.nextInt();
                if(guess==x){
                    System.out.println("you guessed it right");
                    break;
                }
                
                else if(guess<x){
                    System.out.println("your guess is too low");
                }
                else{
                    System.out.println("your gueass is too high");
                }
               }
                if(att==maxAttempts){
                    System.out.println("you have reached maximum attempts");
                    System.out.println("the random number was " +x);
                    
                }
                System.out.println("do you want to play again? type 1 for yes and 2 for no");
                int again =sc.nextInt();
                if(again==1){
                    repeat(4);
                    }
                    else if(again>2|| again <1){
                        System.out.println("please select 1 or 2");
                    }
                    else{
                        System.out.println("thank you");
                    }   

            }
        
                public static void repeat(int n){
                    Scanner sc = new Scanner(System.in);
                    Random ra = new Random();
               int maxAttempts=n;
               
               int att=0;
               System.out.println("enter the minimum number\n");
               int min = sc.nextInt();
               System.out.println("enter the maximum number\n");
               int max =sc.nextInt();
               int x=ra.nextInt((max-min)+1)+min;
               for(;att<maxAttempts;att++){
                System.out.println("enter the guessed number");
                int guess = sc.nextInt();
                if(guess==x){
                    System.out.println("you guessed it right");
                    break;
                }
                
                else if(guess<x){
                    System.out.println("your guess is too low");
                }
                else{
                    System.out.println("your gueass is too high");
                }
               }
                if(att==maxAttempts){
                    System.out.println("you have reached maximum attempts");
                    System.out.println("the random number was " +x);
                    
                }
            

                }
            }
        
        
    
    

