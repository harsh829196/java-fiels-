abstract class IPL {
    int num ; 
    String name ; 

    IPl(int x , String name){
        num= x ;
        this.name = name ; 
    }
    void show(){
        System.out.print("win"+ num + " " + name) ;
    }

}
class KKR extends IPL {
    KKR(int x , String b){
        super(x,b); 
    }
}

public class abstractclasswithsuper {
   public static void main(String[] args) {
     KKR obj = new KKR("virat", 18) ;
   }
}
