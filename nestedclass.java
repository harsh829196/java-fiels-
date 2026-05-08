class Outer {
    class Inner{
        void show(){
            System.out.println("CSE");
        }
    }
    //Outer(){
     //   Inner ob1 = new Inner();        we can use this 
     //   ob1.show();        but there exits another way .
    //}
}
public class nestedclass {
    public static void main(String[] args) {
        Outer obj = new Outer(); 
        Outer.Inner ob1 = obj.new Inner(); //this is calling 
        ob1.show() ; // by referencs 
    }
}
