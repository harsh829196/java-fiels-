
import java.io.*;

public class tryreadwrite {
    public static void main(String[] args) throws IOException{
        try(FileReader obj= new FileReader("input.txt"); 
            FileWriter obj1 = new FileWriter("output.txt")){
            int data = obj.read();
            System.out.println((char)data);
            obj1.write(data);
        }
    }
}
// here error is not in try its with try so throws will hendle it care fully 