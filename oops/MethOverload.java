package oops;
class animal{}
class monkey extends animal{
    }
    class animalapp{
        public void m1(monkey m){
            System.out.println("monkey");
        }
        public void m1(animal a){
            System.out.println("animal");
        }
    }
class calculator{
    // ......................................arguement based
    public static void add(int a,int b){
        System.out.println(a+b);
    }
    public static void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
    public static void add(int a,int b,int c,int d){
        System.out.println(a+b+c+d);
    }

    // //.....................................preference class
    // public static void add(String s){
    //     System.out.println("string");
    // }
    // public static void add(Object o){
    //     System.out.println("object");
    // }
    // //......................................ambiguous 
    // public static void add(int a,float b){
    //     System.out.println(a+b);
    // }
    // public static void add(float a,int b){
    //     System.out.println(a+b);
    // }
    ///........................................normal 
    // public static void add(int a,int b){
    //     System.out.println(a+b);
    // }
    // public static void add(float a,float b){
    //     System.out.println(a+b);
    // }
}
class advancedcalculator{
    public static void add(int...args){
        int sum= 0;
        for(int data:args){
            sum+=data;
        }
        System.out.println(sum);
    }
}
public class MethOverload {
    public static void main(String[] args) {
         calculator c= new calculator();
         c.add(10, 30);
         c.add(10,20, 30);Z
         c.add(10,20, 30,40);

         advancedcalculator ad =new advancedcalculator();
         ad.add(10,20);
         ad.add(10,20,30);
         ad.add(10,20,30,40);
        // c.add("abc");
        // c.add(new Object());
        // c.add(null);
        // animalapp a = new animalapp();
        // animal ani=new animal();
       
        // a.m1(ani);//animal 
        //  monkey m =new monkey();
        // a.m1(m);//monkey
        // animal an= new monkey();
        // a.m1(an);// animal as an is animal 
        
    }
    
}
