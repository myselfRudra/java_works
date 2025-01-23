class suboverload {
    public  int sub(int a,int b){
        return (a-b);
    }
    public int sub(int a,int b,int c){
        return (a-b-c);
    }
    public double sub(double a,double b){
        return (a-b);
           }
    
}
public class subdrive {
    public static void main(String[] args) {
     suboverload so = new suboverload();
    System.out.println(so.sub(10,9));
    System.out.println(so.sub(10 ,4,1 ));
    System.out.println(so.sub(11.1, 10.1));
   
    }
    
}
