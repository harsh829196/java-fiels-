class Rajnikant{
    void coolie(){
        System.out.println("BOSS") ;
    }
}
public class anomusclass {
    public static void main(String[] args) {
        Rajnikant obj= new Rajnikant(){
            public void coolie(){
                System.out.println("BOSS-48");
            }
        };
        obj.coolie(); 
    }
}
