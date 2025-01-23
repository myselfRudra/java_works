package oops;
class parents
{
    public  void property(){
        System.out.println("money+gold+cash");
    }
    public  void marry(){
        System.out.println("random girl");
    }
}
class child extends parents
{
    //overriding
    public  void marry(){
        //reimplementation
        System.out.println("lover");
    }
}
class planes
{
    public void takeoff(){
        System.out.println("plane taking off");
    }
    public void fly(){
        System.out.println("plane flying");
    }
    public void land(){
        System.out.println("plane landing");
    }
}
class passplanes extends planes{
    public void takeoff(){
        System.out.println("pass-plane taking off");
    }
    public void fly(){
        System.out.println("pass-plane flying");
    }
    public void land(){
        System.out.println("pass-plane landing");
    }
} 
class fightplanes extends planes{
    public void takeoff(){
        System.out.println("fight-plane taking off");
    }
    public void fly(){
        System.out.println("fight-plane flying");
    }
    public void land(){
        System.out.println("fight-plane landing");
    }
}
class airport
{
    public void allowplane(planes p){
        p.takeoff();
        p.fly();
        p.land();
        System.out.println();
    }
}
class over
{
    public Object meth(){
    return null;
    }
}
class gotit extends over{
    public String meth(){
        System.out.println("yes got it");
                return null;
    }
}
class access
{
    protected void methone(){
    System.out.println("accessed");
    }
}
class accessmod extends access
 {
    default void methone(){
        System.out.println("yes got it");
                
    }
}
class parent{
    public final void meth(){
        System.out.println("nonono");
    }
}
class childs extends parent{
    public void meth(){
        System.out.println("overridden");
    }
}
abstract class par{
    public abstract void method();
}
class chi extends par{
    public void method(){
        System.out.println("abstract");
    }
}
public class overriding {

    public static void main(String[] args) {
        //......................................abstract access modifier
        // par p= new chi();
        // p.method();
        // //....................................final access modifier
        // parent p = new childs();
        // p.meth();
        // //.................................basis of access modifier
        // access a = new accessmod();
        // a.methone();
        // //........................basis of return type
        // over o = new gotit();
        // o.meth();
        // // child c = new child();
        // // c.marry();
        // // c.property();
        // // parents p = new parents();
        // // p.marry();
        // // parents p1 = new child();
        // // p1.marry();
        //....................................planes
        // planes p = null;
        // p= new passplanes();
        // p.takeoff();
        // p.fly();
        // p.land();
        // p=new fightplanes();
        // p.fly();
        // p.takeoff();
        // p.land();
        // //.....................insted of calliing these functions multiple times we can call a class
        passplanes p = new passplanes();
        fightplanes f = new fightplanes();
        airport a = new airport();
        a.allowplane(p);
        a.allowplane(f); 
        // //..................also can be written like this
        // a.allowplane(new passplanes());
        // a.allowplane(new fightplanes());

    }    
}
