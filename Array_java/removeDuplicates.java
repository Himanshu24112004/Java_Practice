import java.util.Scanner;

public class removeDuplicates {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]==arr[j]){
                    for(int k=j; k<n-1; k++){
                        arr[k] = arr[k+1];
                    }
                    n--;
                    j--;
                }
            }
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}


/*

Using hashset : DSA topic 

HashSet<Integer> set = new HashSet<>();
for(int num : arr){
set.add(num);
}
for(int num : set){
System.out.println(num+" ");
}

*/
