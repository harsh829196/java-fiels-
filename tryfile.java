import java.io.FileReader;
import java.io.*;

public class tryfile {
    public static void main(String[] args) throws IOException {
        try (FileReader obj = new FileReader("input.txt")) {
            int data;
            while ((data = obj.read()) != -1) {
                System.out.print((char) data);
            }
        }
    }
}