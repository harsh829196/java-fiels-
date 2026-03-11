interface IPL {
    void show();
}
class KKR implements IPL{
    public void show(){
        System.err.println("virat 18 ");
    }
}

public class interfaceyu {
    public static void main(String[] args) {
        KKR obj = new KKR() ;
        obj.show(); 
        System.out.print("");
    }
}
