class Outer {
     static class Inner{
        void show(){
            System.out.println("CSE");
        }
    }
    
}
public class absstatic {
    public static void main(String[] args) {
        
        Outer.Inner ob1 = new Outer.Inner(); //this is calling 
        ob1.show() ; // by referencs 
    }
}

