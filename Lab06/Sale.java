package Lab06;

public class Sale extends Employee{
    double commission;
    public Sale(){}
    public Sale(double commission) {
        this.commission = commission;
    }

    public Sale(String name, double salary, double commission) {
        super(name, salary);
        this.commission = commission;
    }
    public double getCommission() {
        return commission;
    }

    public double calSalary(){
        return getSalary()+getCommission();
    }
    
    public String  toString(){
        return "My name is : "+super.getName()+"\nI am a sale."+"\nMy sarary is "+calSalary()+"\n";

    }
}
