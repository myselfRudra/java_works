package oops;
class employee{
    private int eid;
    private int age;
    private String name;
    //setter
    public void seteid(int eid){
        this.eid=eid;
    }
    public void setage(int age){
        this.age=age;
    }
    public void setname(String name){
        this.name = name;
    }
    //getter
    public int geteid(){
        return eid;
    }
    public int getage(){
        return age;
    }
    public String getname(){
        return name;
    }
    
}
class student
{
    private int roll;
    private String name;
    private String address;


    // setter method
    public void setroll(int roll){
        this.roll=roll;

    }
    public void setname(String name){
        this.name=name;
            }
    public void setaddr(String address){
        this.address=address;    
    }
    //getter method
    public int getroll(){
        return roll;
    }
    public String getname(){
        return name;
    }
    public String getaddr(){
        return address;
    }

}

public class encapsulation {
    public static void main(String[] args) {
        student s1 = new student();
        //calling setter methods
        s1.setroll(1);
        s1.setname("rud");
        s1.setaddr("bwn");
        //calling getter methods
        System.out.println(s1.getroll());
        System.out.println(s1.getname());
        System.out.println(s1.getaddr());
        employee e1=new employee();
        e1.seteid(1);
        e1.setage(25);
        e1.setname("rrr");
        System.out.println(e1.geteid());
        System.out.println(e1.getage());
        System.out.println(s1.getname());
    }
    
}
