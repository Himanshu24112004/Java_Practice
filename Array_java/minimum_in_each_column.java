import java.util.Scanner;

public class minimum_in_each_column {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr= new int[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                     arr[i][j] =  sc.nextInt();
            }
        }

        for(int j=0; j<m; j++){
            int min = Integer.MAX_VALUE;
            for(int i=0; i<n; i++){
                if(arr[i][j]<min){
                    min = arr[i][j];
                }
            }
            System.out.println("minimum in column "+j+" = "+ min);
        }
        sc.close();
    }
}
