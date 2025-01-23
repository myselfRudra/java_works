package project;
  import java.util.Scanner;
public class main{
    static Scanner sc=new Scanner(System.in);
    static class bankb{
        double bal;
        public  bankb(double initialbal){
          bal=initialbal;
        }
        public double getbal(){
            return bal;
        }
        public double deposit(double amount){
            if(amount>0){
                bal+=amount;
            }
            return bal;
        }
        public double withdraw(double amount){
            if(amount>0 && amount<=bal){
                bal-=amount;
            }
            return bal;
        }
    }
    static class atm{
        static bankb x;
        public  atm(bankb y){
            x=y;           

            }
            public static String withdraw(double amount){
                if(amount>x.getbal()){
                    return "insufficient bal";

                 }
                 else if(amount<=0){
                    return"must be greater than zero";
                 }
                 else{
                    x.withdraw(amount);
                    return +amount+"is withdrawn and new bal is"+x.getbal();
                 }
            }
            public static String deposit(double amount){
                if(amount<0){
                    return "deposited amount cannot be zero";

                 }
                 
                 else{
                    x.deposit(amount);
                    return +amount+"is deposited and new bal is"+x.getbal();
                 }
                             }
                             public static  String checkb(){
                                return " balance is"+x.getbal();
                               
                             }
            
        }
      
        static class mains{
        public static void main(String[] args) {
            bankb acc = new bankb(1000);     
            atm atmm = new atm(acc);
            System.out.println("1.withdraw");
            System.out.println("2.deposit");
            System.out.println("3.check balance");
            System.out.println("4.exit");
            System.out.println("enter your choice");
            int choice= sc.nextInt();
            switch(choice){
                case 1:
                System.out.println("enter withdraw amount");
                double wamt=sc.nextDouble();
                String wammt=atm.withdraw(wamt);
                System.out.println(wammt);
                break;
                case 2: 
                System.out.println("enter deposit amount");
                double damt=sc.nextInt();
                String dammt=atm.deposit(damt);
                System.out.println(dammt);
                break;
                case 3:
                 String blchk=atm.checkb();
                 System.out.println(blchk);
                 break;
                 case 4: 
                 System.out.println("thank you");
                            
            }

        }

    }
   
}


