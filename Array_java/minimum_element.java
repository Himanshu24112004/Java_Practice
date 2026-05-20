import java.util.Scanner;

public class minimum_element {
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

        int min = Integer.MAX_VALUE;

         for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                    if(arr[i][j]<min){
                        min = arr[i][j];
                    }
            }
        }

        System.out.println(min);
        sc.close();
    }
}
