package Lab602;
public class TestLab602{
    public static void main(String[] args) {
       Person p1 = new Person("Jame", 1988);
       Person p2 = new sheriff("Bank", 2000, "Mueang");
       Person p3 = new Police("Bell", 2001, "Chonburi");

       p1.introduce();
       p2.introduce();
       p3.introduce();
       
    }
}
