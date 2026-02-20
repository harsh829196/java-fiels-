class Calc{
    Calc() {
        
        System.out.println("hii");
        this(10); /// this should be at the top of any meathod in vs code it works but not in other 
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
