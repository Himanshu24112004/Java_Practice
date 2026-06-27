import java.util.Scanner;

public class maxRowSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] arr = new int[r][c];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int maxRow = 0;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<r; i++){
            int sum = 0;
        for(int j=0; j<c; j++){
            sum += arr[i][j];
        }
            System.out.print(sum +" ");
        if(sum>max){
            max = sum;
            maxRow = i+1;
            }
        }
        System.out.println(maxRow);
        sc.close();
    }
}
