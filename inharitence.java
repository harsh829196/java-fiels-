class av{
    //av() {System.out.print("this is from av");}
  void run() {
    System.out.print("this is from av");
  }
}
class cd extends av{
    //cd () {System.out.print("this is from cd");}
    void runn() {
    System.out.print("this is from cd");
}
}
class df extends cd {
    //df (){System.out.print("this is from df");}

}

public class inharitence {
    public static void main(String[] args) {
        //cd obj = new av() ;
        //av obj = new cd() ;
        //cd obj = new cd() ;
        //av obj = new av();
        obj.runn();

    }
}
