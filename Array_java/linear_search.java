import java.util.Scanner;

public class linear_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int key = sc.nextInt();
        boolean found = false;

        for(int i=0; i<n; i++){
            if(arr[i]==key){
                found = true;
                return;
            }
        }

        if(found){
            System.out.println("Found !!! ");
        }
        else{
            System.out.println("Not found !! ");
        }
        sc.close();
    }
}
