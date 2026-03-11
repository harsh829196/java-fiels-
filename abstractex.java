abstract class IPL {
    abstract void RCB() ;
}
    class KKR extends IPL {
        void RCB(){
            System.out.print("wins");
        }
    }

public class abstractex {
    public static void main(String[] args) {
        KKR obj = new KKR()  ; 
        obj.RCB() ;
        System.out.print(""); 

    }
}
