import java.util.Scanner;

public class swap_and_last_column {
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

        for(int i =0; i<n; i++){
           int temp = arr[i][0];
           arr[i][0]= arr[i][m-1];
           arr[i][m-1]= temp;
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(arr[i][j]+" ");
            }
             System.out.println();
        }
        sc.close();
    }
}
