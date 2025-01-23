// import java.util.Scanner;
// class Student{
//     int roll;
//     String name;
//     double cgpa;
//     Student(int roll,String name,double cgpa){
//         this.roll=roll;
//         this.name= name;
//         this.cgpa=cgpa;
//     }
//     void display(){
//         System.out.println("Roll:"+roll+"name:"+name+"cgpa"+cgpa);

//     }
// }
// public class StudentDetails{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter no. of students");
//         int n= sc.nextInt();
//         Student[] stu = new Student[n];
//         for (int i = 0; i < n; i++) {
//             System.out.println("Enter details for student " + (i + 1) + ":");
//             System.out.print("Roll: ");
//             int roll = sc.nextInt();
//             sc.nextLine();
//             System.out.print("Name: ");
//             String name = sc.nextLine();
//             System.out.print("CGPA: ");
//             double cgpa = sc.nextDouble();
//             sc.nextLine();

//             stu[i] = new Student(roll, name, cgpa);
//         }
//         System.out.println("\nStudent Details:");
//         for (Student student : stu) {
//             student.display();
//         }
//         Student lowestCgpaStudent = stu[0];
//         for (int i = 1; i < stu.length; i++) {
//             if (stu[i].cgpa < lowestCgpaStudent.cgpa) {
//                 lowestCgpaStudent = stu[i];
//             }
//         }

        
//         System.out.println("\nStudent with the lowest CGPA:");
//         lowestCgpaStudent.display();

//         sc.close();

//     }
// }
