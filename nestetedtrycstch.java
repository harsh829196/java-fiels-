public class nestetedtrycstch {
    public static void main(String[] args) {
        try{
            String s=null; 
            try{
                System.out.println(s.length());
            }
            catch(NullPointerException e){
                System.out.println("Error");
            }
        }
    }
}
