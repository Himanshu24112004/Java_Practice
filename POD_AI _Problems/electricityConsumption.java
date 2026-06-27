import java.util.Scanner;

public class electricityConsumption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            sum += arr[i];
            if(arr[i]> max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Highest: "+max);
        System.out.println("Lowest: "+min);
        System.out.println("Total: "+sum);

        sc.close();
    }
}
