class Outer {
        void show()
        {
          class Inner
          {
                void run()
                {
                    System.out.println("CSE");
                }
            }
            Inner obj= new Inner(); 
            obj.run();
        }
         
}
    
public class localclass {
    public static void main(String[] args) {
        
        Outer ob1 = new Outer(); 
        ob1.show() ; 
    }
}