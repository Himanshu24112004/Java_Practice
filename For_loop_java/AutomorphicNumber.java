import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        long sq = (long)n*n;
        int temp = n;
        boolean match = true;
        
        for(;temp>0; temp/=10, sq/=10){
            if(temp % 10 != sq % 10){
                match = false; 
                break ;
            }
        }
        if(match){
            System.out.println("Automorphic Number");
        }
        else{
            System.out.println("Not Automorphic Number");
        }
        sc.close();
    }
}


public class AutomorphicNumber {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        long sq = (long)n*n;
        int temp = n;
        boolean match = true;
        
        for(;temp>0; temp/=10, sq/=10){
            if(temp % 10 != sq % 10){
                match = false; 
                break ;
            }
        }
        if(match){
            System.out.println("Automorphic Number");
        }
        else{
            System.out.println("Not Automorphic Number");
        }
        sc.close();
    }
}


public class AutomorphicNumber {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        long sq = (long)n*n;
        int temp = n;
        boolean match = true;
        
        for(;temp>0; temp/=10, sq/=10){
            if(temp % 10 != sq % 10){
                match = false; 
                break ;
            }
        }
        if(match){
            System.out.println("Automorphic Number");
        }
        else{
            System.out.println("Not Automorphic Number");
        }
        sc.close();
    }
}
