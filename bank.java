public class bank {
    private String name;
    private double interest;
     bank(String name,double interest){
        this.name=name;
        this.interest=interest;
     }
     public double loan(double year,double amt){
        return amt+(amt*year*interest/100);
     }
     public String getName() {
        return name;
     }
     public static void main(String[] args) {
        bank sbi = new bank("sbi", 11.8);
        bank hdfc = new bank("hdfc",10.2);
        bank icici = new bank("icici",12.4);
     
     double amt=100000;
     double year = 12;
     double sbiL = sbi.loan(year,amt);
     double hdfcL = hdfc.loan(year,amt);
     double iciciL = icici.loan(year,amt);
    
     bank highestB=sbi;
     double highL=sbiL;
     if(hdfcL>highL){
        highestB=hdfc;
        highL=hdfcL;
     }
     if(iciciL>highL){
        highestB= icici;
        highL=iciciL;
     }
     System.out.print(sbiL);
     System.out.print(hdfcL);     
     System.out.print(iciciL);
     System.out.printf(highestB.getName(),highL);     
     

    }

}
