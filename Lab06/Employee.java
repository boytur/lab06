package Lab06;

public class Employee {
    String name;
    double salary ;
    public Employee(){}
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double calSalary (){
        return getSalary();
    }
    public String toString(){
        return "My name is : "+getName()+"\n"+"I am employee.\n"+"My salary is "+calSalary()+"\n";
    }
}
