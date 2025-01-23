package oops;

class account
    {
        private double balance;
    
    public double getbal(double balance)
    {
        //autheticate
        boolean result = validate("rudra","rudra13");
        if(result==true)
        {
            //withdraw
            this.balance = this.balance - balance;
            return balance;
        }
        else{
            System.out.println("envalid user");
            return 0.0;
                }
        

        

    }
    public void setbal(double balance)
    {
        //authenticate
        boolean result = validate("rudra","rudra123");
        if(result==true){
            //deposit
            this.balance = this.balance + balance;
            System.out.println("credited");

        }
        else
        {
            //throw a meaningful reply to user
            System.out.println("envalid user");
        }

        
    }
    private boolean validate(String user,String password)
    {
        //check if the name really exist or not
        return user.equalsIgnoreCase("rudra") && password.equals("rudra123");

         
    }
}
   public class oops1 { 
    
        public static void main(String[] args) {
            account acc= new account();
            acc.setbal(1000.0);
            double bal = acc.getbal(500.0);
            System.out.println("debited"+bal);

        }
    
}

    

