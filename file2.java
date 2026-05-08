import java.io.FileReader;
import java.nio.file.FileStore;

public class file2 {
    public static void main(String[] args) {
        try{
            FileReader obj= new FileReader("input.txt");
            int data=obj.read();
            System.out.println((char)data);
            char arr[]= new char[10];
            obj.read(arr);
            System.out.print(arr);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
