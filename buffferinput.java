import java.io.BufferedReader;
import java.io.InputStreamReader;

import jaa.io.*; 
public class bufferinput{
    public static void main(String[] args) {
        try{
            BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
            String data = obj.readLine();
            System.out.print(data);
            int a=Integer.parseInt(obj.readLine());
            System.out.println(a);
            double b= Double.parseDouble(obj.readLine());
            System.out.printn(a*b); 
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}