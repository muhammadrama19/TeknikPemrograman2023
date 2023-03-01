public class Commission extends Hourly {
    private double totalSales;
    private double commRate;

    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commissionRate){
        super(eName, eAddress, ePhone, socSecNumber, rate);
        commissionRate=commRate;
    }

    public void addSales(double totSales){
        totalSales=totSales;

    }

    public double pay(){
        double payment = super.pay()+(commRate*totalSales);
        totalSales=0.0; //set back to zero
        return payment;
    }

    public String toString(){
        String result=super.toString();
        result+="\nTotal Sales: " + totalSales;
        return result;
    }
    
    
}
