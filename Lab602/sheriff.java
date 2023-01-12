package Lab602;

public class sheriff extends Person{
    String workState ;

    public sheriff(String workState) {
        this.workState = workState;
    }

    public sheriff(String name, int bornYear, String workState) {
        super(name, bornYear);
        this.workState = workState;
    }
    public String getWorkState() {
        return workState;
    }
    @Override
    public void introduce() {
        // TODO Auto-generated method stub
        super.introduce();
        System.out.println("I'm a sheriff and work in "+getWorkState() );
    }
}
