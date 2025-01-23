package oops;
abstract class bird
{
    public abstract void fly();
    public abstract void eat();
}
class sparrow extends bird
{
    public void fly(){
        System.out.println("mid high");
    }
    public void eat(){
        System.out.println("grains");
    }
}
abstract class eagle extends bird
{
    public void fly(){
        System.out.println("very high");
    }
    public abstract void eat();
    }
class serpanteag extends eagle{
    public void eat(){
        System.out.println("snakes");
    }
    }
class goldeneag extends eagle{
    public void eat(){
        System.out.println("overseas");
    }
}
class sky
{
    public void allow(bird b){
        b.fly();
        b.eat();
    }
}
public class birds {
    public static void main(String[] args) {
        sky s= new sky();
        s.allow(new sparrow());
        s.allow(new goldeneag());
        s.allow(new serpanteag());
        bird b = new sparrow();
        b.fly();
        b.eat();

    }
    
}
