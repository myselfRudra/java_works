package methods;

public class withnpnr {
    static class calc {
        int a ;
        int b;
        int res;
        void add()
        {
            a=10;
            b=20;
            res = a+b;
            System.out.println(res);
        }
    
        
    }
    static class Launch{
        public static void main(String[] args) {
            withnpnr.calc ccc=new withnpnr.calc();
            ccc.add();
        }
    }
}
