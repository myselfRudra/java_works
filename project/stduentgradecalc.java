package project;
import java.util.Scanner;
public class stduentgradecalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of subjects");
        int noofsubjects=sc.nextInt();
        int[] arr = new int[noofsubjects];
        int total=0;
        for(int i=0;i<noofsubjects;i++){
            System.out.println("Enter the marks obtained (out of 100) in subject"+(i+1)+":");
            arr[i]=sc.nextInt();
           
        }
        for(int ele:arr){
            total+=ele;       
        }
        System.out.print("Total marks obtained in "+noofsubjects+ " subjects is "+total+"\n");
        double avgp=total/(double)noofsubjects;
        System.out.println("The average percentage is "+(avgp)+"%");
        System.out.print("Your grade is : ");
        grade(avgp);
        
           }
           public static void grade(double avgp){
            if (avgp >= 90) {
                System.out.print("A");
            } else if (avgp >= 80) {
                System.out.print("B");
            } else if (avgp >= 70) {
                System.out.print("C");
            } else if (avgp >= 60) {
                System.out.print("D");
            } else {
                System.out.print("F");
            }
        }
    
           }
    

