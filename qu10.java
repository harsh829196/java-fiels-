
class Calc {
    {
        System.out.println("hii");
        //this is called initializer block runs before constructor
    }

    static {
        System.out.println("hii");
        //this is called initializer block runs before constructor
    }
    Calc() {
        System.out.println("hello");
        //this is static initializer block runs  only ones before contructor 
    }
    
}
public class qu10 {

    
        public static void main(String[] args) {
            {
        System.out.println("this is from main class ");
    }
        Calc obj = new Calc();
        Calc obj1 = new Calc();
    }
}
