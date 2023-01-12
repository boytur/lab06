package Lab602;

public class Police extends Person{
    String workCountry ;

    public Police(String workCountry) {
        this.workCountry = workCountry;
    }

    public Police(String name, int bornYear, String workCountry) {
        super(name, bornYear);
        this.workCountry = workCountry;
    }
    
    public String getWorkCountry() {
        return workCountry;
    }

    @Override
    public void introduce() {
        // TODO Auto-generated method stub
        super.introduce();
        System.out.println("I' m a police and work in "  + getWorkCountry());
    }
}