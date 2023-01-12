package Lab06;

public class Manager  extends Employee{
    String parkingNO ;
    public Manager(String parkingNO) {
        this.parkingNO = parkingNO;
    }
    public Manager(String name, double salary, String parkingNO) {
        super(name, salary);
        this.parkingNO = parkingNO;
    }
    public double calSalary(){
        return getSalary();
    }
    public String  toString(){
        return "My name is : "+super.getName()+"\nI am a maneger."+"\nMy sarary is "+calSalary()+"\n";
    }
}
