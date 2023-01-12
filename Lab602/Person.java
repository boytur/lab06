package Lab602;

public class Person {
    String name ; 
    int bornYear ;
    public Person (){}
    public Person(String name, int bornYear) {
        this.name = name;
        this.bornYear = bornYear;
    }
    public int getBornYear() {
        return bornYear;
    }
    public String getName() {
        return name;
    }
    public void setBornYear(int bornYear) {
        this.bornYear = bornYear;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void introduce (){
        System.out.println("My name is " + getName()+".");
        System.out.println("I was born is " + getBornYear()+".");
    }
}
