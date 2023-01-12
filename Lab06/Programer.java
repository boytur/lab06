package Lab06;

import java.util.Arrays;

public class Programer extends Employee{
    String proSkills [] = new String[99];
    int OT ;
    public Programer(String[] proSkills, int oT) {
        this.proSkills = proSkills;
        OT = oT;
    }
    public Programer(String name, double salary, int oT) {
        super(name, salary);
        OT = oT;
    }
    public Programer(String name, double salary, String [] proSkills, int oT) {
        super(name, salary);
        this.proSkills = proSkills;
        OT = oT;
    }
    public int getOT() {
        return OT;
    }
    public double calSalary (){
        return getSalary()+getOT();
    }
    public String[] getProSkills() {
        return proSkills;
    }
    public String  toString(){
        return "My name is : "+super.getName()+"\nI am a programer."+"\nMy skill is : "+Arrays.toString(this.proSkills)+"\nMy salary is "+calSalary()+"\n";
    }
}
