import java.util.Scanner;

public class count_even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

          int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int even =0, odd =0 ;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(arr[i][j]%2==0){
                    even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Even Number : "+even+" Odd Number : "+odd);
        sc.close();
    }
} 
}
