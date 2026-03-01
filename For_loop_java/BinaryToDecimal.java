import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args){
        Scanner sc =new  Scanner(System.in);
       long binary = sc.nextInt();
       int decimal=0;
       int base=1;

       for(;binary>0; binary/=10){
        int lastdigit = (int)(binary%10);
        decimal += lastdigit*base;
        base *= 2;
       }
       System.out.println(decimal);
       sc.close();
    }
}


public class BinaryToDecimal {
    public static void main(String[] args){
        Scanner sc =new  Scanner(System.in);
       long binary = sc.nextInt();
       int decimal=0;
       int base=1;

       for(;binary>0; binary/=10){
        int lastdigit = (int)(binary%10);
        decimal += lastdigit*base;
        base *= 2;
       }
       System.out.println(decimal);
       sc.close();
    }
}


public class BinaryToDecimal {
    public static void main(String[] args){
        Scanner sc =new  Scanner(System.in);
       long binary = sc.nextInt();
       int decimal=0;
       int base=1;

       for(;binary>0; binary/=10){
        int lastdigit = (int)(binary%10);
        decimal += lastdigit*base;
        base *= 2;
       }
       System.out.println(decimal);
       sc.close();
    }
}


