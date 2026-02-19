 class Student{
    int roll; 
    int reg ; 
    private Student(int a , int b ){
        System.out.println("im from prameterized constructer ");
        roll = a ;
        reg = b ;
        System.err.println(a*b);
    }

    Student (){
        System.out.println("hi this is running through constucter (public by defult)");
        

    }
    void display(){
        Student a = new Student(10,40);
        System.out.println("hi this is running through  private prameterised constucter");
        
    }
 }
 class qu6 {
    public static void main(String[] args) {
        Student w = new Student(); 
        w.display();
        

    }
}
