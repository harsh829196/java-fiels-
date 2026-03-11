class Shape{
    void cal(int x ){
    System.out.print("hii");
    }
}
class Circle extends Shape{
    void cal(int x ){
        System.out.println("circle " +3.14 * x * x  );
    }
}
class  Rectangle  extends Shape{
    void cal(int x ,int y ){
    System.out.println("rectangler " + x*y) ;
    }
}

public class poluQ2 {
    public static void main(String[] args) {
        Shape obj[] = new  Shape() ;
        
            obj[0].cal(2);
            //obj[1].cal(2, 4);
            //obj[2].cal(9,8);

        
    }
}
