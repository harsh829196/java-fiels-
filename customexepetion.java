class NewExeption extends Exception{
    public NewExeption(String m){
        super(m) ;
    }
}
public class customexepetion {
    public static void main(String[] args) {
        try{
            int num= 19 ; 
            if(num>15)
                throw new NewExeption("dont give num more then 15");
            else 
                System.out.println(num);
        }
        catch (NewExeption e){
            System.out.println(e.getMessage());
        }
    }
}
