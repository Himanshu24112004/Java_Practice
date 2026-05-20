import java.util.Scanner;

public class check_if_array_is_sorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int  n  = sc.nextInt();

        int[] arr = new  int[n];
        int sorted = 1;

        for(int i= 0; i<n; i++){
            arr[i]= sc.nextInt();
        }

        for(int i = 0; i<n-1; i++){
            if(arr[i]>arr[i+1]){
                sorted =0;
                break;
            }
        }
        if(sorted == 1){
            System.out.println("Sorted");
        }
        else{
            System.out.println("Not Sorted");
        }
        sc.close();
    }
}
