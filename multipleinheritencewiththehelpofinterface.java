interface IPL18 {
    void RCB();
}

interface IPL19 {
    void SRH();
}

class KKR implements IPL18, IPL19 {

    public void RCB() {
        System.out.println("Virat 18");
    }

    public void SRH() {
        System.out.println("Ishan");
    }
}

public class multipleinheritencewiththehelpofinterface{

    public static void main(String[] args) {

        KKR obj = new KKR();
        obj.RCB();
        obj.SRH();
        System.out.print("");

    }
}