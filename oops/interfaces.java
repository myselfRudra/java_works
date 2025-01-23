package oops;
interface Icalculator 
{
    //public abstract 
    void add(int a,int b);
    void sub(int a,int b);
    // void mul(int a,int b);
    // void div(int a,int b);    
}
interface Iadvancecal extends Icalculator // built relationship b/w  two interfaces 
{
    void mul(int a,int b);
    void div(int a,int b);    
}
// class yoyocal 
// {
//     public void mul(int a,int b){
//         System.out.println("mul"+(a*b));
//     }
//     public void div(int a,int b){
//         System.out.println("div"+(a/b));
//     }    
//}
//first inheritence 
//then implementation
// class calculatorimp extends yoyocal implements Icalculator//,Iadvancecal
class calculatorimp implements Iadvancecal
{
    //Icalculator
    public void add(int a,int b){
        System.out.println("sum is"+(a+b));
    }
    public void sub(int a,int b){
        System.out.println("sum is"+(a-b));
    }
    //Iadvancecal
    public void mul(int a,int b){
        System.out.println("sum is"+(a*b));
    }
    public void div(int a,int b){
        System.out.println("sum is"+(a/b));
    }
}
public class interfaces {
    public static void main(String[] args) {
    //    Icalculator icl = new calculatorimp();

    // calculatorimp icl = new calculatorimp();
    Iadvancecal icl = new calculatorimp();

        icl.add(20,30);
        icl.sub(20,30);
        // Iadvancecal advcl = new calculatorimp();
        // advcl.mul(20,30);
        // advcl.div (20,30);
        icl.mul(20, 30);
        icl.div(20, 30);

    }
    
}
