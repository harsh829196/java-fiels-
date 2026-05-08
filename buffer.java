import java.io.BufferedReader;

public class buffer {
    public static void main(String[] args) {
        try{
            FileReader obj = new FileReader("intput.txt");
            BufferedReader objbr = new BufferedReader(obj);
            string line ; 
            while(line = objBR.reader()!=null){
                System.out.println(line);
            }
            catch(Exception e){
                Sysstem.out.println(e); 
            }
        }
    }
}
