import java.io.FileOutputStream;

public class FILE {
    public static void main(String[] args) {
        try{
            FileOutputStream obj = new FileOutputStream("output.txt");
            obj.write('A');
            obj.write("avnajj\n".getBytes());
            byte.arr[]="Hello".getBytes();
            obj.write(arr);
            obj.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    
