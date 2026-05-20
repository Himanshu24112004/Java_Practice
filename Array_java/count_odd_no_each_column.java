import java.util.Scanner;

public class count_odd_no_each_column {
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

         for(int j=0; j<m; j++){
            int count = 0;
           for(int i=0; i<n; i++){
               if(arr[i][j]%2!=0){
                count++;
               }
            }
            System.out.println("Odd Numbers in column "+j+" = "+count);
        }
        sc.close();
    }
}
