import java.io.FileWriter;

public class filwrite {
    public static void main(String[] args) {
        try{
            FileWriter obj = new FileWriter("output.txt");
            obj.write('A');
            obj.write("Asddffg");
            obj.append("HEllo");
            obj.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
