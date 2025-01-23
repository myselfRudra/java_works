package oops;


abstract class person{
    int age;
    String name;
    float height;
    person(int age,String name,float height){
        this.age= age ;
        this.name= name;
        this.height= height;
    }
}
class Stu extends person{
    int marks;
    int roll;
    
    Stu(int age,String name,float height,int marks,int roll){
     super(age,name,height);
     this.age=age;
     this.name=name;
     this.height=height;
     this.roll=roll;
     this.marks=marks;
    }
     public void display(){
        System.out.println("age"+age);
        System.out.println("name"+name);
        System.out.println("height"+height);
        System.out.println("marks"+marks);
        System.out.println("roll"+roll);
     }

}
abstract class plane{
    public abstract void fly();
    public abstract void takeoff();
    public abstract void land();
}
class pass extends plane
{
    public void fly(){
        System.out.println("pass fly");        
    }
    public void takeoff(){
        System.out.println("pass takeoff");
    }
    public void land(){
        System.out.println("pass land");
    }
}
class fight extends plane 
{
    public void fly(){
        System.out.println("fight fly");        
    }
    public void takeoff(){
        System.out.println("fight takeoff");
    }
    public void land(){
        System.out.println("fight land");
    }
}
class airportt{
    public void allowplanes(plane ref){
        ref.fly();
        ref.takeoff();
        ref.land();
    }
}
public class abstraction {
   public static void main(String[] args) {
    // airportt a = new airportt();
    // a.allowplanes(new pass());
    // a.allowplanes(new fight());
    // Stu s = new Stu(19,"rud",5.85f,89,392039);
    // s.display();
   } 
}
