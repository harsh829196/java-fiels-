class Vahicle{
    int speed ; 
    void move(int x){
        speed = x ;
        System.err.println("vahiclew " +  speed);
    }
} 

class Car extends Vahicle{
    
    void move(int x){
        speed = x ;
        System.err.println("car " + speed );
    }
} 

class Bike extends Vahicle{
    
    void move(int x){
        speed = x ;
System.err.println("Bike " + x );
    }
} 

public class polyQue {
    public static void main(String[] args) {
        Vahicle obj = new Car(); 
        obj.move(20);
    }
}
