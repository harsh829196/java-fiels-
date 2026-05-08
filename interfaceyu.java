interface IPL {

    //int x ;  we can not use constructer to assign value ;
    int x = 5 ; // so we neet to give vlaue directly ; 
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
