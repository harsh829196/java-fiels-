class Calc{
    Calc() {
        
        System.out.println("hii");
        this(10);
    }
    Calc(int a){
        System.out.print(a);
    }
}
public class qu9 {
    public static void main(String[] args) {
        Calc obj = new Calc();
    }
}
