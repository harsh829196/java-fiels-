abstract class IPL {
    int num ; 
    String name ; 

    IPL(int x , String name){
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
/*
We cannot create an object of an abstract class. 
So how are the data members of the abstract class initialized?

When a child class object is created, the constructor of the abstract 
class is automatically called. Using 'super()', the child class calls 
the constructor of the parent (abstract) class and passes the values 
to initialize its data members.

Therefore, even though we cannot create an object of the abstract class,
its constructor still runs when the child class object is created.
*/
public class abstractclasswithsuper {
   public static void main(String[] args) {
     KKR obj = new KKR(18,"virat") ;
   }
}
