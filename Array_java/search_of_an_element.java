import java.util.Scanner;

public class search_of_an_element {
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

        int target = sc.nextInt();
        boolean found = false;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(target==arr[i][j]){
                    found = true;
                    return ;
                }
            }
        }
       
        if(found){
            System.out.println("Element Found");
        }
        else{
            System.out.println("Element Not Found");
        }

        sc.close();
    }
}
