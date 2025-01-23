package string;

import java.util.Scanner;

public class cntvowels {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        int n = s.length();
           int count =0;
        for(int i=0;i<n;i++){
           char ch= s.charAt(i);
           if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
            count++;
                    
           }       
                  }
                   System.out.println(count+"");
    }
    
}
