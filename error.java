


public class error {
    public static void main(String[] args) throws Exception {
        int num = 19;


        assert num < 15 : "Dont pass num more than 18";

        int mum = 19;

        if (mum > 15) {
           throw new Exception("not acceptable");
        }

        System.out.println(num);
    }
}