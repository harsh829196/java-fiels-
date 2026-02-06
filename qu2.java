import java.util.Scanner;
class qu2 {
    public static void main(String arg[]){
        Scanner in = new Scanner(System.in);
        int x= in.nextInt();
        int arr[][]= new int[x][3];
        int ans = 0 ; 
        for (int i=0 ; i< x ; i++){
            for (int j=0 ; j< 3 ; j++){
                arr[i][j]=in.nextInt();
            }
        }

        for (int i = 0 ; i < x ; i++){
            int count = 0 ; 
            for (int j = 0 ; j< 3 ; j++){
                if (arr[i][j]==1){
                    count++; 
                }
            }
            if (count>=2){
                ans++; 
            }
        }

        System.out.print(ans);
    }
}

 