package oops;
class Person
{
    public String name;
    public int age;
    public String address;
}
class Student extends Person
{
    public int marks;
    public String grade;
    Student(String name,int age,String address,int marks,String grade){
        this.name=name;
        this.age=age;
        this.address=address;
        this.marks=marks;
        this.grade=grade;

    }
    public  void disp()
        {
            System.out.println("name : "+name);
            System.out.println("age : "+age);
            System.out.println("address : "+address);
            System.out.println("marks : "+marks);
            System.out.println("greade : "+grade);
        }   
    }
    
    public class polymorphismm {
        public static void main(String[] args) {
            Student stu1 = new Student("rud", 020, "ueda", 83, "o");
            stu1.disp();
    }
    
}
