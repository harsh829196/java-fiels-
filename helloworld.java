import java.util.Scanner;
class helloworld {
	public static void main(String args[]){
	Scanner in= new Scanner(System.in);
        int a = in.nextInt() ;
        int sum= 0; 
        for (int i = 1; i < a; i++ ){
            if (a%i==0){
                sum+=i;
            }
        }
		if (sum==a){
        System.out.print(1);
		}
		else {
			
			System.out.print(0);
		}

    
        
    }
}
