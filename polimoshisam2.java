class SpiderMan{
    void Power(int a  ,int b ){
        System.out.println("green "+(a+b));
    }
}
class Spiderman123 extends SpiderMan{
    void Power(int a , int b){
        System.out.println("Fight "+(a*b));
    }
}
class TheAmazingSpiderMan12 extends Spiderman123{
    void Power(int a , int b){
        System.out.println("one block");
    }
}

public class polimoshisam2 {
    public static void main(String[] args) {
        //SpiderMan  obj = new SpiderMan ();
        SpiderMan  obj = new Spiderman123();
        obj.Power(2,4);
    }
}
