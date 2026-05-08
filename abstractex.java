abstract class IPL {
    abstract void RCB() ;
}
    class KKR extends IPL {
        void RCB(){
            System.out.print("wins");
        }
    }

public class abstractex {
    public static void main(String[] args) {
        KKR obj = new KKR()  ; 
        obj.RCB() ;
        System.out.print(""); 

    }
}
// why we need abstract class ? we need it becouse sometimes we want to hide 
// implimentation part and we only show funtionality  
// what i understand is this helps in preventing overriding methords
// in inheritence . for example what if i want to use parent's methord if 
// child has methord with same name ? or simpley first we declear meathord 
//abstract class Shape abstract class Shape 
//{
  ///  abstract double area();
//}
//class Circle extends Shape {
 //   double area() {
     //   return 3.14 * 5 * 5;
  //  } this i s a use case ;
    
