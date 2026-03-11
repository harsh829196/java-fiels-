class Spiderman{
    void Power(){
        System.out.println("Green");
    }
}
class Spiderman123 extends Spiderman{
    void Power(){
        System.out.println("Blue");
    }
}


public class polymorphisam {
    public static void main(String[] args) {
        Spiderman obj = new Spiderman123(); 
        obj.Power();
    }
}
