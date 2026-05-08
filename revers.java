import java.io.*;

public class revers {
   public static void main(String[] args) {
    try{
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        int a=Integer.parseInt(obj.readLine());
        int ans =0 ;
        while(a!=0){
            int x= a%10; 
            ans= ans*10+ x ;
            a=a/10;
        }
        System.out.print(ans);
    }
    
    catch(Exception e){
            System.out.println(e);
        }
   }
}

